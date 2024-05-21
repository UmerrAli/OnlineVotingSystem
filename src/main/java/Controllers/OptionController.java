package Controllers;
import DAO.OptionDAO;
import DAO.PollDAO;
import Models.PollOption;
import Models.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
@RequestMapping("/pollOption")
public class OptionController {
	
    @Autowired
    OptionDAO optionDAO;
    
    @Autowired
    PollDAO pollDAO;
    
    @RequestMapping("/add/{id}")
    public String addOptionPage(@PathVariable("id") int id,Model model) {
        Poll poll = pollDAO.get(id);
        List<PollOption> pollOptions = optionDAO.getOptionByPollId(id);
        model.addAttribute("poll",poll);
        model.addAttribute("options",pollOptions);
        return "addOption";
    }
    
    @RequestMapping("/handleForm")
    public String addOptionHandleForm(@ModelAttribute PollOption pollOption, @RequestParam("pollId") int id) {
        pollOption.setPollId(id);
        optionDAO.save(pollOption);
        return "redirect:add/"+id;
    }
    
    @RequestMapping("/toVote/{id}")
    public String displayOptionsToVoter(@PathVariable("id") int pollId,Model model) {
        Poll poll = pollDAO.get(pollId);
        List<PollOption> pollOptions = optionDAO.getOptionByPollId(pollId);
        System.out.println(pollOptions);
        model.addAttribute("poll",poll);
        model.addAttribute("options",pollOptions);
        return "optionsToVote";
    }
}
