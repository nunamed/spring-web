<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
<html>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>My JSP index.jsp</title>
<body>
    未注册的用户，请<a href="${pageContext.request.contextPath}/register">注册</a><br>
    已注册的用户，去<a href="${pageContext.request.contextPath}/login">登录</a>
</body>
</html>
