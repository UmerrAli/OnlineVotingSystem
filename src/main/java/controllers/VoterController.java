package controllers;

import Authentication.Authentication;
import DAO.PollDAO;
import DAO.VoterDAO;
import Models.Poll;
import Models.Voter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping("/voter")
public class VoterController {
    @Autowired
    private VoterDAO voterDAO;
    @Autowired
    private PollDAO pollDao;
    @RequestMapping("/home")
    public String Home(Model model) {
        List<Poll> polls = pollDao.getAll();
        model.addAttribute("polls",polls);
        return "voterHome";
    }

    @RequestMapping("/login")
    public String loginVoter() {
        return "voterLogin";
    }

    @RequestMapping("/displayAll")
    public String displayVoters(Model model, HttpServletRequest request) {
        if(Authentication.authenticate(request).equals("admin")){
            List<Voter> voters = voterDAO.getAll();
            model.addAttribute("voters", voters);
            return "displayVoters";
        }
        return "redirect:/admin/login";
    }

    @RequestMapping("/add")
    public String registerVotersPage(HttpServletRequest request) {
        if(Authentication.authenticate(request).equals("admin")){
            return "addVoter";
        }
        return "redirect:/admin/login";
    }

    @RequestMapping(value = "/handleForm",method = RequestMethod.POST)
    public String addVoterFormHandler(@ModelAttribute Voter voter, HttpServletRequest request) {
        if(Authentication.authenticate(request).equals("admin")){
            voterDAO.save(voter);
            return "redirect:displayAll";
        }
        return "redirect:/admin/login";
    }

    @RequestMapping("/deleteVoter/{id}")
    public String deleteVoter(@PathVariable("id") int id, HttpServletRequest request) {
        if(Authentication.authenticate(request).equals("admin")){
            voterDAO.delete(id);
            return "redirect:/voter/displayAll";
        }
        return "redirect:/admin/login";
    }
}
