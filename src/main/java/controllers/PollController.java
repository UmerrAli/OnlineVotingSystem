package controllers;

import DAO.PollDAO;
import Models.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/poll")
public class PollController {
    @Autowired
    private PollDAO pollDAO;

    @RequestMapping("/add")
    public String addPollsPage() {
        return "addPolls";
    }
    @RequestMapping("/handleForm")
    public String addPollHandleForm(@ModelAttribute Poll poll) {
        poll.setStatus(true);
        poll.setWinner(null);
        pollDAO.save(poll);
        return "redirect:/admin/home?username=admin&password=admin";
    }

}
