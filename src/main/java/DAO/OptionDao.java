package DAO;

import Models.Option;
import Models.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class OptionDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void save(Option option) {
        this.hibernateTemplate.save(option);
    }
    public List<Option> displayOptions(){
        return this.hibernateTemplate.loadAll(Option.class);
    }
}
