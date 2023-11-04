<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
<html>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>My JSP index.jsp</title>
<body>
<<<<<<< HEAD
<s:if test="#session['user']!=null">
    <jsp:forward page="main.jsp"/>=
</s:if>
<div align="center">
<s:form action="main" method="post" theme="simple">
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
如果没有注册单击<a href="register.jsp">这里</a>
</div>
=======
    未注册的用户，请<a href="${pageContext.request.contextPath}/register">注册</a><br>
    已注册的用户，去<a href="${pageContext.request.contextPath}/login">登录</a>
>>>>>>> 4c61fab5e3d541f43578a74ef1329e094add1fb5
</body>
</html>
