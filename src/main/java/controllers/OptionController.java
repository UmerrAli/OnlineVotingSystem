package controllers;

import DAO.OptionDao;
import Models.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/option")
public class OptionController {
    @Autowired
    OptionDao optionDao;
    @RequestMapping("/add/{id}")
    public String addOptionPage(@PathVariable("id") int id) {
        //TO-DO
        return "addOption";
    }
    @RequestMapping("/handleForm")
    public String addOptionHandleForm(@ModelAttribute Option option) {
        optionDao.save(option);
        return "redirect:displayAll";
    }
    @RequestMapping("/displayAll")
    public String displayOptions(Model model) {
        List<Option> options = optionDao.displayOptions();
        model.addAttribute("voters", options);
        return "displayOptions";
    }
}
