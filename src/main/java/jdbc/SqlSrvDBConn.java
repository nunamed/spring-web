package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import POJO.User;
import tool.BeanListHandler;

public class SqlSrvDBConn {
    private Connection connection;
    private PreparedStatement prepareStatement;
    public SqlSrvDBConn() throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "123456";
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
    }
    public ArrayList<User> userquery() throws Exception{
        String sql = "SELECT * FROM usertable";
        prepareStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prepareStatement.executeQuery();
        BeanListHandler<User> bh = new BeanListHandler<User>(User.class);
        // ArrayList<String> User =new ArrayList<>();
        // for(User user:UserList){
        //     User.add("Username:"+user.getUsername()+",Password:"+user.getPassword());
        // }
        ArrayList<User> users = bh.hander(resultSet);
        resultSet.close();
        connection.close();
        return users;
    }
    public boolean update(String sql){
        try{
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.executeUpdate();
            return true;

        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
