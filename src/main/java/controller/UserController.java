package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import POJO.User;
import dao.UserDao;
@Controller("userController")
public class UserController{
    @Autowired
    private UserDao userDao;
    public void test(){
        User user = userDao.selectUserById(1);
        System.out.println(user);
        System.out.println("----------------------");
        List<User> users=userDao.selectAllUser();
        for (User user2 : users) {
            System.out.println(user2);
        }
    }
    @RequestMapping("main")
    public String index() {
        
        return "main";
    }
}