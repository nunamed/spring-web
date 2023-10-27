package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import POJO.Comment;
import POJO.User;
import tool.BeanListHandler;

public class SqlSrvDBConn {
    private Connection connection;
    private PreparedStatement prepareStatement;
    private static SqlSrvDBConn instance;
    private SqlSrvDBConn() throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "123456";
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
    }
    public static synchronized SqlSrvDBConn getInstance() throws ClassNotFoundException, SQLException {  
        if (instance == null) {  
            instance = new SqlSrvDBConn();
        }  
        return instance;  
    }

    public ArrayList<User> userquery() throws Exception{
        String sql = "SELECT * FROM usertable";
        prepareStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prepareStatement.executeQuery();
        BeanListHandler<User> bh = new BeanListHandler<User>(User.class);
        // ArrayList<String> UserList =new ArrayList<>();
        // for(User user:UserList){
        //     User.add("Username:"+user.getUsername()+",Password:"+user.getPassword());
        // }
        ArrayList<User> users = bh.hander(resultSet);
        resultSet.close();
        prepareStatement.close();
        return users;
    }
    public boolean update(String sql){
        try{
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.executeUpdate();
            prepareStatement.close();
            return true;

        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
    public ArrayList<Comment> commentquery() throws Exception{
        String sql = "SELECT * FROM comment";
        prepareStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prepareStatement.executeQuery();
        BeanListHandler<Comment> bh = new BeanListHandler<Comment>(Comment.class);
        ArrayList<Comment> comments = bh.hander(resultSet);
        resultSet.close();
        prepareStatement.close();
        return comments;
    }
}
