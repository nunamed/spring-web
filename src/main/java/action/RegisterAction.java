package action;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import POJO.User;
import jdbc.SqlSrvDBConn;

public class RegisterAction extends ActionSupport{
    private User user;
    public String execute() throws ClassNotFoundException, SQLException {
        Date date = new Date();
        SimpleDateFormat sdft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        user.setCreatedate(sdft.format(date));
        String sql ="insert into usertable(username,password,sex,name,grade,createdate) values('"+user.getUsername()+"','"+user.getPassword()+"',"+user.getSex()+",'"+user.getName()+"','"+user.getGrade()+"','"+user.getCreatedate()+"')";
        SqlSrvDBConn SqlSrvDB = new SqlSrvDBConn();
        if(SqlSrvDB.update(sql)){
            return SUCCESS;
        }else{
            return ERROR;
        }
        
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
}
