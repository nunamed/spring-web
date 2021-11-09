package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class QuitAction extends ActionSupport{
    public String execute() {
        ActionContext context=ActionContext.getContext();
        Map<String, Object> session = context.getSession();
        session.clear();
        return SUCCESS;
    }
}
