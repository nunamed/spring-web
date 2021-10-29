<%@ page language="java" pageEncoding="UTF-8" import="java.sql.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <%
           session.invalidate();
            response.sendRedirect("index.jsp");

            /*out.print("request:"+(String)request.getAttribute("request")+"<br>");
            out.print("session:"+(String)session.getAttribute("session")+"<br>");
            out.print("application:"+(String)application.getAttribute("application")+"<br>");*/
            //resultSet.close();
            //SqlSrvDB.closeStmt();
            
            //SqlSrvDB.closeConn();
        %>
        <%-- <c:forEach var="user" items="google,runoob,taobao">
            <c:out value="${user}"/>
        </c:forEach> --%>
        <%-- <table border="1" width="200">
        <s:iterator value="userList" var="listid">
            <tr>
                <td><s:property value="#listid.value"/></td>
            </tr>
        </s:iterator> --%>
      <%-- <s:iterator value="#listid.value" id="listidsub">
            <tr>
                <td><s:property value="#listidsub.id"/></td>
                <td><s:property value="#listidsub.username"/></td>
                <td><s:property value="#listidsub.password"/></td>
            </tr>
        </s:iterator> --%>
    </table>
    </body>
</html>