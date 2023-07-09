package controllers;

import DAO.VoterDAO;
import Models.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/voter")
public class VoterController {
    @Autowired
    private VoterDAO voterDAO;
    @RequestMapping("/login")
    public String loginVoter(){
        return "voterLogin";
    }
    @RequestMapping("/register")
    public String registerVoter(){
        return "registerVoter";
    }
    @RequestMapping("/addVoter")
    public String addVoterFormHandler(@ModelAttribute Voter voter){
        voterDAO.saveVoter(voter);
        return "voterAddedSuccess";
    }
}
