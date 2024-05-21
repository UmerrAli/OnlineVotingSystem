package Controllers;
import Authentication.Authentication;
import DAO.PollDAO;
import Models.Poll;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private PollDAO pollDAO;
    
    @Autowired
    private Authentication authentication;

    @RequestMapping("/login")
    public String loginAdmin() {
        return "adminLogin";
    }

    @RequestMapping("/home")
    public String home(HttpServletRequest request, Model model) {
        if (authentication.authenticate(request).equals("admin")) {
            List<Poll> polls = pollDAO.getAll();
            model.addAttribute("polls", polls);
            return "adminHomePage";
        }
        return "redirect:login";
    }

    @RequestMapping("/handleForm")
    public String formHandler(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        session.setAttribute("role", "admin");
        return "redirect:/admin/home";
    }

    @RequestMapping("/logout")
    public String formHandler(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("username");
        session.removeAttribute("password");
        session.removeAttribute("role");
        return "redirect:/admin/login";
    }
}
