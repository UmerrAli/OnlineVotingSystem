package controllers;

import DAO.VoterDAO;
import Models.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VoterRegistration {
    @Autowired
    private VoterDAO voterDAO;
    @RequestMapping("/registerVoter")
    public String registerVoter(){
        return "registerVoter";
    }
    @RequestMapping("/addVoter")
    public String addVoter(@ModelAttribute Voter voter){
        voterDAO.saveVoter(voter);
        return "voterAddedSuccess";
    }
}
