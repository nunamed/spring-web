package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import POJO.Comment;
import jdbc.SqlSrvDBConn;

public class CommentAction extends ActionSupport{
    private ArrayList<Comment> comments;
    public String execute() throws Exception{
        SqlSrvDBConn SqlSrvDB = SqlSrvDBConn.getInstance();
        comments = SqlSrvDB.commentquery();
        return SUCCESS;
    }
    public ArrayList<Comment> getComments() {
        return comments;
    }
    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
    
}
