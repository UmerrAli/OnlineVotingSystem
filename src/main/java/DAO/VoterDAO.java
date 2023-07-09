package DAO;

import Models.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Component
public class VoterDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public void saveVoter(Voter voter){
        this.hibernateTemplate.save(voter);
    }
    public List<Voter> displayVoters(){
       return this.hibernateTemplate.loadAll(Voter.class);
    }
    @Transactional
    public void delete(int id){
        Voter voter = (Voter) this.hibernateTemplate.load(Voter.class,id);
        this.hibernateTemplate.delete(voter);
    }

}
