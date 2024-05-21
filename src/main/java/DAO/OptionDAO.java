package DAO;
import Models.Models;
import Models.PollOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class OptionDAO {
	
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void save(Models models) {
        PollOption pollOption = (PollOption) models;
        this.hibernateTemplate.save(pollOption);
    }
    
    public List<PollOption> getAll() {
        return this.hibernateTemplate.loadAll(PollOption.class);
    }

    public Object get(int id) {
        return this.hibernateTemplate.get(PollOption.class, id);
    }

    public List<PollOption> getOptionByPollId(int pollId) {
        String sql = "SELECT * FROM PollOption WHERE pollId = ?";
        return jdbcTemplate.query(sql, new Object[]{pollId}, new RowMapper<PollOption>() {
            @Override
            public PollOption mapRow(ResultSet rs, int rowNum) throws SQLException {
                PollOption pollOption = new PollOption();
                pollOption.setOptionId(rs.getInt(1));
                pollOption.setOptionName(rs.getString("optionName"));
                return pollOption;
            }
        });
    }

    public void delete(int id) {
        PollOption pollOption = (PollOption) this.hibernateTemplate.load(PollOption.class, id);
        this.hibernateTemplate.delete(pollOption);
    }
}
