package controller;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import POJO.UserForm;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpSession;
import service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
    private static Log logger = LogFactory.getLog(UserController.class);
    @Autowired
    public UserService userService;
    @RequestMapping("/login")
    public String login(@ModelAttribute UserForm user,HttpSession session,Model model) throws ServletException, IOException {
        if (userService.login(user)) {
            session.setAttribute("user", user);
            logger.info("成功");
            return "main";
        }else{
            logger.info("失败");
            model.addAttribute("messageError","用户名或密码错误");
            return "login";
        }

        // if("zhangsan".equals(uname) && "123456".equals(upass)){
        //     //session.setAttribute("u", user);
        //     logger.info("成功");
        //     return "main";
        // }else{
        //     logger.info("失败");
        //     model.addAttribute("name", uname);
        //     model.addAttribute("messageError", "用户名或密码错误");
        //     //request.getRequestDispatcher("/login").forward(request,response);
        //     return "login";
        // }
    }
    @RequestMapping("/register")
    public String register(@ModelAttribute UserForm user,HttpSession session,Model model){
        if(userService.register(user)){
            logger.info("成功");
            return "login";
        }else{
            logger.info("失败");
            return "register";
        }
    }
    
}
