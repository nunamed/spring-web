<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%String name=(String)request.getAttribute("name");
if(name==null){
    name="";
}%>
<html>
    <body>
       <form action="${pageContext.request.contextPath}/user/login" method="post" name="registForm">
            <table align="center">
                <tr>
                    <td colspan="2" align="center">用户登录</td>
                </tr>
                <tr>
                    <td>姓名：</td>
                    <td><input class="textSize" type="text" name="uname" value="<%=name%>"/></td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td><input class="textSize" type="password" name="upass"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="登录"/></td>
                    <td><input type="reset" value="重置"/></td>
                </tr>
            </table>
            <%=(String)request.getAttribute("messageError")==null?"":(String)request.getAttribute("messageError")%>
        </form>
    </body>
</html>