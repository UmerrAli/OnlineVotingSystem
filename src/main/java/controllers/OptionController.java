package controllers;

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
        model.addAttribute("poll",poll);
        return "addOption";
    }
    @RequestMapping("/handleForm")
    public String addOptionHandleForm(@ModelAttribute PollOption pollOption, @RequestParam("pollId") int id) {
        pollOption.setPollId(id);
        optionDAO.save(pollOption);
        return "redirect:testController";
    }

    @RequestMapping("/displayAll")
    public String displayOptions(Model model) {
        List<PollOption> pollOption = optionDAO.getAll();
        model.addAttribute("voters", pollOption);
        return "displayOptions";
    }
}
