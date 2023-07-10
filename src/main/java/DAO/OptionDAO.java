package DAO;

import Models.Models;
import Models.PollOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class OptionDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void save(Models models) {
        PollOption pollOption = (PollOption) models;
        this.hibernateTemplate.save(pollOption);
    }
    public List<PollOption> getAll(){
        return this.hibernateTemplate.loadAll(PollOption.class);
    }

    public Object get(int id) {
        return (PollOption) this.hibernateTemplate.get(PollOption.class, id);
    }

    public void delete(int id) {
        PollOption pollOption = (PollOption) this.hibernateTemplate.load(PollOption.class, id);
        this.hibernateTemplate.delete(pollOption);
    }

    public void update(int id, Models models) {
        //TODO
    }
}
