package controllers;

import DAO.VoterDAO;
import Models.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private VoterDAO voterDAO;

    @RequestMapping("/login")
    public String loginAdmin(){
        return "adminLogin";
    }

    @RequestMapping("/displayVoters")
    public String displayVoters(Model model){
        List<Voter> voters = voterDAO.displayVoters();
        model.addAttribute("voters",voters);
        return "displayVoters";
    }

    @RequestMapping("/registerVoter")
    public String registerVoter(){
        return "registerVoter";
    }

    @RequestMapping("/addVoter")
    public String addVoterFormHandler(@ModelAttribute Voter voter){
        voterDAO.saveVoter(voter);
        return "redirect:displayVoters";
    }
    @RequestMapping("/deleteVoter/{id}")
    public String deleteVoter(@PathVariable("id") int id){
        voterDAO.delete(id);
        return "redirect:/admin/displayVoters";
    }
}
