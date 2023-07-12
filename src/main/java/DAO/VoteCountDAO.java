package DAO;

import Models.Models;
import Models.VoteCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class VoteCountDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public void save(Models models) {
        VoteCount poll = (VoteCount) models;
        this.hibernateTemplate.save(poll);
    }
}
