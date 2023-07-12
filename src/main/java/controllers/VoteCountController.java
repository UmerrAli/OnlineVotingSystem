package controllers;

import DAO.VoteCountDAO;
import Models.VoteCount;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("voteCount")
public class VoteCountController {
    @Autowired
    private VoteCountDAO voteCountDAO;
    @RequestMapping("/addVote")
    public String addVote(@RequestParam("selectedOption") int selectedOptionId, @RequestParam("pollId") String pollIdString, HttpServletRequest request){
        VoteCount voteCount = new VoteCount();
        int pollId = Integer.parseInt(pollIdString.replace(",",""));
        voteCount.setPollId(pollId);
        voteCount.setSelectedOptionId(selectedOptionId);
        int voterId = (int) request.getSession().getAttribute("voterId");
        voteCount.setVoterId(voterId);
        voteCountDAO.save(voteCount);
        return "redirect:/voter/home";
    }
}
