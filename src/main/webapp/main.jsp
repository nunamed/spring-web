<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>留言板信息</title>
    </head>
    <body>
        <s:set var="user" value="#session['user']"/>
        <s:property value="#user.username"/>，您好！欢迎
        <s:form action="upload" method="post" enctype="multipart/form-data">
            <s:file name="upload" label="上传的文件"></s:file>
            <s:submit value="上传"></s:submit>
        </s:form>
    </body>
</html>