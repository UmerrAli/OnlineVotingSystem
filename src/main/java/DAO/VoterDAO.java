package DAO;

import Models.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class VoterDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public void saveVoter(Voter voter){
        this.hibernateTemplate.save(voter);
    }

}
