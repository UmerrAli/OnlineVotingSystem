package DAO;
import Models.Models;
import Models.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class VoterDAO {
	
    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Transactional
    public void save(Models models){
        Voter voter = (Voter) models;
        this.hibernateTemplate.save(voter);
    }
    
    public List<Voter> getAll(){
       return this.hibernateTemplate.loadAll(Voter.class);
    }
    
    public Voter get(int id){
        return (Voter) this.hibernateTemplate.get(Voter.class,id);
    }
    
    @Transactional
    public void delete(int id){
        Voter voter = (Voter) this.hibernateTemplate.load(Voter.class,id);
        this.hibernateTemplate.delete(voter);
    }
    
    public int getVoterId(String nama,String passwrod){
        List<Voter> voterList = getAll();
        for (Voter voter : voterList) {
            if (voter.getVoterName().equals(nama) && voter.getVoterPassword().equals(passwrod)) {
                return voter.getVoterId();
            }
        }
        return -1;
    }
}
