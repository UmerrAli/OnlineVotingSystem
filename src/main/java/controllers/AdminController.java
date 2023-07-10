package controllers;

import DAO.PollDAO;
import DAO.VoterDAO;
import Models.Poll;
import Models.Voter;
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

    @RequestMapping("/login")
    public String loginAdmin(){
        return "adminLogin";
    }
    @RequestMapping("/home")
    public String home(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        if(username.equals("admin") && password.equals("admin")) {
            List<Poll> polls = pollDAO.getAll();
            model.addAttribute("polls",polls);
            return "adminHomePage";
        }
        return "redirect:login";
    }
}
