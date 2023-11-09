package service;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

import POJO.User;
import POJO.UserForm;
import dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userdao;
    @Override
    public boolean login(UserForm user) {
        List<User> users = userdao.selectAllUser();
        for (User datauser:users){
            if(datauser.getUsername().equals(user.getUname())&&datauser.getPassword().equals(user.getUpass())){
                return true;
            } 
        }
        return false;
    }

    @Override
    public boolean register(UserForm user) {
       if("zhangsan".equals(user.getUname())&&"123456".equals(user.getUpass())){
            return true;
        }
        return false;
    }
}
