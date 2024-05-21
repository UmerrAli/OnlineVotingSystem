package Models;
import javax.persistence.*;

@Entity
public class Voter implements Models {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voterId;
    
    private String voterName;

    private String voterPassword;

    public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getVoterPassword() {
        return voterPassword;
    }

    public void setVoterPassword(String voterPassword) {
        this.voterPassword = voterPassword;
    }
}
