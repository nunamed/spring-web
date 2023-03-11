package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterController implements Controller{
    @Override
    public ModelAndView handleRequest(HttpServletRequest arg0,HttpServletResponse arg1)throws Exception{
        return new ModelAndView("register");
    }
}