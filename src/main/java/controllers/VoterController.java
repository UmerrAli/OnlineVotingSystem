package controllers;

import DAO.VoterDAO;
import Models.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/voter")
public class VoterController {
    @Autowired
    private VoterDAO voterDAO;

    @RequestMapping("/home")
    public String Home() {
        /* TO-DO */
        return null;
    }

    @RequestMapping("/login")
    public String loginVoter() {
        return "voterLogin";
    }

    @RequestMapping("/displayAll")
    public String displayVoters(Model model) {
        List<Voter> voters = voterDAO.displayVoters();
        model.addAttribute("voters", voters);
        return "displayVoters";
    }

    @RequestMapping("/add")
    public String registerVotersPage() {
        return "addVoter";
    }

    @RequestMapping("/handleForm")
    public String addVoterFormHandler(@ModelAttribute Voter voter) {
        voterDAO.saveVoter(voter);
        return "redirect:displayAll";
    }

    @RequestMapping("/deleteVoter/{id}")
    public String deleteVoter(@PathVariable("id") int id) {
        voterDAO.delete(id);
        return "redirect:/voter/displayAll";
    }
}
