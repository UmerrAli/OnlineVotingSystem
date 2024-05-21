package Models;
import javax.persistence.*;

@Entity
public class PollOption implements Models {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int optionId;
    
    private String optionName;

    private int pollId;

    public int getPollId() {
        return pollId;
    }

    public void setPollId(int pollId) {
        this.pollId = pollId;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
}
