package controllers;

import DAO.VoterDAO;
import Models.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String displayVoters(){
        return "displayVoters";
    }
    @RequestMapping("/registerVoter")
    public String registerVoter(){
        return "registerVoter";
    }
    @RequestMapping("/addVoter")
    public String addVoterFormHandler(@ModelAttribute Voter voter){
        voterDAO.saveVoter(voter);
        return "displayVoters";
    }
}
