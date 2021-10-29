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
    public SqlSrvDBConn() throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "123456";
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
    }
    public ArrayList<User> userquery() throws Exception{
        String sql = "SELECT * FROM usertable";
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prepareStatement.executeQuery();
        BeanListHandler<User> bh = new BeanListHandler<User>(User.class);
        // ArrayList<String> User =new ArrayList<>();
        // for(User user:UserList){
        //     User.add("Username:"+user.getUsername()+",Password:"+user.getPassword());
        // }
        return bh.hander(resultSet);
        // resultSet.next();
        // String address = resultSet.getString("address");
        // System.out.println(address);
    }
}
