package mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import POJO.User;

public class MybatisTest {
    public static void main(String[] args) {
        try {
            InputStream config = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
            SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(config);
            SqlSession ss = ssf.openSession();
            List<User> userlist = ss.selectList("dao.UserDao.selcetAllUser");
            for(User user:userlist){
                System.out.println("ID:"+user.getId()+"\tName:"+user.getName()+"\tUsername:"+user.getUsername()+"\tPassword:"+user.getPassword());
            }
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
