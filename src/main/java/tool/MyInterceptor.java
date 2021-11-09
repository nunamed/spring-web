package tool;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import action.CommentInsertAction;

public class MyInterceptor extends AbstractInterceptor{

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        CommentInsertAction action = (CommentInsertAction)invocation.getAction();
        if(action.getUser()==null){
            return Action.ERROR;
        }
        return invocation.invoke();
    }
}
