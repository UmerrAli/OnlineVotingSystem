package DAO;

import Models.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


import javax.transaction.Transactional;
import java.util.List;


@Component
public class PollDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public void save(Poll poll){
        this.hibernateTemplate.save(poll);
    }
    public Poll poll(int id){
        return (Poll) this.hibernateTemplate.get(Poll.class,id);
    }
    public List<Poll> displayPolls(){
        return this.hibernateTemplate.loadAll(Poll.class);
    }
    @Transactional
    public void delete(int id){
        Poll poll = (Poll) this.hibernateTemplate.load(Poll.class,id);
        this.hibernateTemplate.delete(poll);
    }

}
