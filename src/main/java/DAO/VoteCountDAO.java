package DAO;
import Models.Models;
import Models.VoteCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import Models.PollOption;

@Component
public class VoteCountDAO {
	
    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Autowired
    private OptionDAO optionDAO;
    
    @Autowired
    private VoteCountDAO voteCountDAO;
    
    @Transactional
    public void save(Models models) {
        VoteCount poll = (VoteCount) models;
        this.hibernateTemplate.save(poll);
    }
    
    public List<VoteCount> getAll(){
        return this.hibernateTemplate.loadAll(VoteCount.class);
    }
    
    public String getWinner(int pollId){
        List<VoteCount> voteCounts = getAll();
        List<Integer> allVotesForPoll = new ArrayList<>();
        for(VoteCount voteCount:voteCounts){
            if(voteCount.getPollId()==pollId){
                allVotesForPoll.add(voteCount.getSelectedOptionId());
            }
        }
        int WinnerId = findMostFrequent(allVotesForPoll);
        PollOption pollOption = (PollOption) optionDAO.get(WinnerId);
        return pollOption.getOptionName();
    }
    
    public int findMostFrequent(List<Integer> list)
    {
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)))
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        return list.get(index);
    }
    
    public boolean voted(int pollId,int voterId){
        List<VoteCount> voteCounts = voteCountDAO.getAll();
        for(VoteCount voteCount:voteCounts){
            if(voteCount.getPollId()==pollId && voteCount.getVoterId()==voterId){
                return true;
            }
        }
        return false;
    }
}
