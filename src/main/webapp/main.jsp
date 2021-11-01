<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>留言板信息</title>
    </head>
    <body>
        <s:set var="user" value="#session['user']"/>
        <s:property value="#user.username"/>，您好！欢迎
    </body>
</html>