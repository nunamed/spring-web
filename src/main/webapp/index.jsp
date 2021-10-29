<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<body>
<%
    if(session.getAttribute("user")!=null){
    %><jsp:forward page="MainServlet"/><%
    }
%>
<form action="MainServlet" method="post">
    <table>
        <caption>用户登录</caption>
        <tr>
            <td>用户名：</td>
            <td>
                <input type="text" name="username" size="20">
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <input type="password" name="password" size="21">
            </td>
        </tr>
    </table>
    <input type="submit" value="登录">
    <input type="reset" value="重置">
</form>
如果没有注册单击<a href="">这里</a>
</body>
</html>
