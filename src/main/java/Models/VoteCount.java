package Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VoteCount implements Models {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voteCountId;
    
    private int selectedOptionId;
    
    private int pollId;
    
    private int voterId;

    public int getVoteCountId() {
        return voteCountId;
    }

    public void setVoteCountId(int voteCountId) {
        this.voteCountId = voteCountId;
    }
    
    public int getSelectedOptionId() {
        return selectedOptionId;
    }

    public void setSelectedOptionId(int selectedOptionId) {
        this.selectedOptionId = selectedOptionId;
    }

    public int getPollId() {
        return pollId;
    }

    public void setPollId(int pollId) {
        this.pollId = pollId;
    }

    public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }
}
