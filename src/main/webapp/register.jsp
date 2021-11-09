<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <body>
        <div align="center">
        <s:form action="register" method="post">
        
            <table>
                <caption>用户注册</caption>
                <tr>
                    <td><s:textfield name="user.username" label="用户名" size="20"/>
                    </td>
                </tr>
                <tr>
                    <td><s:password name="user.password" label="密码" size="21"/>
                    </td>
                </tr>
                <tr>
                    <td><s:textfield name="user.name" label="真实姓名" size="20"/>
                    </td>
                </tr>
                <tr>
                    <td><s:radio name="user.sex" list="#{1:'男',2:'女'}" label="性别" value="1"/>
                    </td>
                </tr>
                <tr>
                    <td><s:textfield name="user.grade" label="专业" size="20"/>
                    </td>
                </tr>
            </table>
            <s:submit value="注册"/>
            <s:reset value="重置"/>
        </s:form>
        </div>
    </body>
</html>