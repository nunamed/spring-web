package controller;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import POJO.UserForm;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {
    private static Log logger = LogFactory.getLog(UserController.class);
    @RequestMapping("/login")
    public String login(String uname,String upass,Model model) throws ServletException, IOException {
        if("zhangsan".equals(uname) && "123456".equals(upass)){
            //session.setAttribute("u", user);
            logger.info("成功");
            return "main";
        }else{
            logger.info("失败");
            model.addAttribute("name", uname);
            model.addAttribute("messageError", "用户名或密码错误");
            //request.getRequestDispatcher("/login").forward(request,response);
            return "login";
        }
    }
    @RequestMapping("/register")
    public String register(@RequestParam String uname,@RequestParam String upass,Model model){
        if("zhangsan".equals(uname) && "123456".equals(upass)){
            logger.info("成功");
            return "login";
        }else{
            logger.info("失败");
            model.addAttribute("uname", uname);
            return "register";
        }
    }
    
}
