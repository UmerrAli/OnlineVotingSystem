package Authentication;
import DAO.VoterDAO;
import Models.Voter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Authentication {
	
    @Autowired
    private VoterDAO voterDAO;

    public  String authenticate(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        String role = (String) session.getAttribute("role");

        if (username == null || password == null || role == null) {
            return "not authenticated";
        }
        if (role.equals("admin")) {
            if (username.equals("admin") && password.equals("admin")) {
                return "admin";
            }
        }
        if (role.equals("voter")) {
            List<Voter> voterList = voterDAO.getAll();
            for (Voter voter : voterList) {
                if (voter.getVoterName().equals(username) && voter.getVoterPassword().equals(password)) {
                    return "voter";
                }
            }
        }
        return "not authenticated";
    }
}
