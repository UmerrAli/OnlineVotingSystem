package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/loginAdmin")
    public String loginAdmin(){
        return "adminLogin";
    }
}
