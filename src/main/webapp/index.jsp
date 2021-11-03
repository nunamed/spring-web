<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
<%
    if(session.getAttribute("user")!=null){
    %><jsp:forward page="MainServlet"/><%
    }
%>
<s:form action="main" method="post">
    <table>
        <caption>用户登录</caption>
        <tr>
            <td>用户名：</td>
            <td>
                <s:textfield name="user.username" size="20"/>
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <s:password name="user.password" size="21"/>
            </td>
        </tr>
    </table>
    <s:submit value="登录"/>
    <s:reset value="重置"/>
</s:form>
如果没有注册单击<a href="">这里</a>
</body>
</html>
