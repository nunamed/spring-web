package service;

import POJO.UserForm;

public class UserServiceImpl implements UserService{

    @Override
    public boolean login(UserForm user) {
        if("zhangsan".equals(user.getUname())&&"123456".equals(user.getUpass())){
            return true;
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
