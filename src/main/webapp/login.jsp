<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
       <form action="" name="registForm">
            <table align="center">
                <tr>
                    <td colspan="2" align="center">用户登录</td>
                </tr>
                <tr>
                    <td>姓名：</td>
                    <td><input class="textSize" type="text" name="uname" value="${user.getUname()}" id="uname"/></td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td><input class="textSize" type="password" name="upass" id="upass"></td>
                </tr>
                <tr>
                    <td><input type="button" value="登录" onclick="denlu()"/></td>
                    <td><input type="reset" value="重置"/></td>
                </tr>
            </table>
        </form>
    </body>
    <script src="js/jquery.min.js"></script>
    <script>
    function denlu(){
        var username=$("#uname").val();
        var password=$("#upass").val();
        $.ajax({
            url:"${pageContext.request.contextPath}/user/login",
            type:"post",
            data:JSON.stringify({uname:username,upass:password}),
            contentType:"application/json;charset=utf-8",
            success:function(data){
                if(data.msg!=null){
                    alert(data.msg);
                }else{
                    window.location.href=data.redirectTo;
                }
            }
        });
    }
    </script>
</html>