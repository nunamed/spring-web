<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <body>
        <div align="center">
        <s:form action="commentinsert" method="post">
        
            <table>
                <caption>用户留言</caption>
                <tr>
                    <td>用户名:<s:property value="#session['user'].username"/>
                    </td>
                </tr>
                <tr>
                    <td><s:textarea name="comment.content" label="内容" size="21"/>
                    </td>
                </tr>
            </table>
            <s:submit value="留言"/>
            <s:reset value="重置"/>
        </s:form>
        </div>
    </body>
</html>