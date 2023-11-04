package dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import POJO.User;
@Repository("userDao")
@Mapper
public interface UserDao {
    public User selectUserById(Integer id);
    public List<User> selectAllUser();
}
