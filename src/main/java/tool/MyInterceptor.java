package tool;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import action.MainAction;

public class MyInterceptor extends AbstractInterceptor{

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        MainAction action = (MainAction)invocation.getAction();
        if(action.getUser().getUsername().equals("123")){
            return Action.INPUT;
        }
        return invocation.invoke();
    }
}
