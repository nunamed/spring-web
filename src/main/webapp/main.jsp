<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="POJO.UserForm"%>
<%-- <%@ taglib prefix="s" uri="/struts-tags"%> --%>
<html>
    <head>
        <title>留言板信息</title>
    </head>
    <body>
        <%
        UserForm user = (UserForm)session.getAttribute("user");
        if(user==null){
        %>
         <div align="center"><a href="login.jsp">请先登录</a></div>
        <%}%>
        ${user}
        <br />
        ${user.uname}
         <br />
        ${user.getUpass()}
        <%--
        <s:set var="user" value="#session['user']"/>
        <s:if test="#user==null">
            <div align="center"><a href="index.jsp">请先登录</a></div>
        </s:if>
        <s:else>
             <div align="right"><s:property value="#user.uname"/>，您好！</div>
        </s:else>
        <s:action name="comment" var="comments"></s:action>  --%>
        <%-- <div align="center">
        <table border="1" >
            <caption>留言板</caption>
            <tr>
                <td align="center">用户名</td>
                <td align="center">内容</td>
                <td align="center">发布时间</td>
            </tr>
            <s:iterator value="#comments.comments" var="comment">
                <tr>
                        <td><s:property value="#comment.username" /></td>
                        <td><s:property value="#comment.content" /></td>
                        <td><s:property value="#comment.releasetime" /></td>
                </tr>
            </s:iterator>
        </table>
        <button onclick="JavaScript:window.open('comment.jsp')">添加</button>
        </div> --%>
        <%-- <s:form action="upload" method="post" enctype="multipart/form-data">
            <s:file name="upload" label="上传的文件"></s:file>
            <s:file name="upload" label="上传的文件"></s:file>
            <s:submit value="上传"></s:submit>
        </s:form> --%>
    </body>
</html>