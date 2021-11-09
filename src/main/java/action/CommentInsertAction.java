package action;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import POJO.Comment;
import POJO.User;
import jdbc.SqlSrvDBConn;

public class CommentInsertAction extends ActionSupport {
    private Comment comment;
    private User user;
    public String execute() throws ClassNotFoundException, SQLException{
        Date date = new Date();
        SimpleDateFormat sdft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        comment.setReleasetime(sdft.format(date));
        ActionContext context=ActionContext.getContext();
        Map<String, Object> session = context.getSession();
        user=(User)session.get("user");
        if(user==null){
            return ERROR;
        }
        comment.setUsername(user.getUsername());
        String sql = "insert into comment(username,content,releasetime) values('"+comment.getUsername()+"','"+comment.getContent()+"','"+comment.getReleasetime()+"')";
        SqlSrvDBConn SqlSrvDB = SqlSrvDBConn.getInstance();
        if(SqlSrvDB.update(sql)){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }
    public void validate() {
        if(comment.getContent()==null||comment.getContent().trim().equals("")){
            addFieldError("comment.content", "内容不能为空");
        }
    }
    public Comment getComment() {
        return comment;
    }
    public void setComment(Comment comment) {
        this.comment = comment;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
}
