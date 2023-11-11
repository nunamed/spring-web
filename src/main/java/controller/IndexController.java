package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("/login")
    public String login(HttpSession session) {
        if(session.getAttribute("user")!=null){
           return "main"; 
        }
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/quit")
    public String quit(HttpSession session){
        System.out.print(session.getAttribute("user"));
        session=null;
        return "login";
    }
}
