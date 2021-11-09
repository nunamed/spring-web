package action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import POJO.User;
import jdbc.SqlSrvDBConn;

public class MainAction extends ActionSupport {
    private User user;
    private boolean validated;
    ArrayList<User> userList;
    public String execute() throws Exception{
        String usr = user.getUsername();
        String pwd = user.getPassword();
        validated = false;
        ActionContext context=ActionContext.getContext();
        Map<String, Object> session = context.getSession();
        try {
            SqlSrvDBConn SqlSrvDB = SqlSrvDBConn.getInstance();
            userList = SqlSrvDB.userquery();
            User usercheck = (User) session.get("user");
            if (usercheck == null) {
                for (User user : userList) {
                    if (user.getUsername().trim().compareTo(usr) == 0) {
                        if (user.getPassword().compareTo(pwd) == 0) {
                            session.put("user", user);
                            validated = true;
                        }
                    }
                }
            }else {
                validated = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(validated){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }

       public User getUser() {
           return user;
       }
       public void setUser(User user) {
           this.user=user;
       }
    
}
