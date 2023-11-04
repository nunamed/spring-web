<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
       <form action="${pageContext.request.contextPath}/user/register" method="post" name="registForm">
            <table border=1 bgcolor="lightblue" align="center">
                <tr>
                    <td colspan="2" align="center">用户注册</td>
                </tr>
                <tr>
                    <td>姓名：</td>
                    <td><input class="textSize" type="text" name="uname" value="${user.uname}"/></td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td><input class="textSize" type="password" name="upass" maxlength="20"></td>
                </tr>
                <tr>
                    <td>确认密码：</td>
                    <td><input class="textSize" type="password" name="reupass" maxlength="20"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="注册"/></td>
                </tr>
            </table>
       </form>
    </body>
</html>