package Controllers;
import DAO.PollDAO;
import DAO.VoteCountDAO;
import Models.Poll;
import Models.VoteCount;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("voteCount")
public class VoteCountController {
	
    @Autowired
    private VoteCountDAO voteCountDAO;
    
    @Autowired
    private PollDAO pollDAO;

    @RequestMapping("/addVote")
    public String addVote(@RequestParam("selectedOption") int selectedOptionId, @RequestParam("pollId") String pollIdString, HttpServletRequest request) {
        VoteCount voteCount = new VoteCount();
        int pollId = Integer.parseInt(pollIdString.replace(",", ""));
        voteCount.setPollId(pollId);
        voteCount.setSelectedOptionId(selectedOptionId);
        int voterId = (int) request.getSession().getAttribute("voterId");
        voteCount.setVoterId(voterId);
        voteCountDAO.save(voteCount);
        return "redirect:/voter/home";
    }

    @RequestMapping("/result/{pollId}")
    public String result(@PathVariable("pollId") int pollId) {
        Poll poll = pollDAO.get(pollId);
        poll.setStatus(false);
        poll.setWinner(voteCountDAO.getWinner(pollId));
        pollDAO.update(poll);
        return "redirect:/admin/home";
    }
}

