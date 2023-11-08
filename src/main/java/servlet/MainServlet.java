package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import POJO.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jdbc.SqlSrvDBConn;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        resp.setCharacterEncoding("gb2312");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        req.setCharacterEncoding("UTF-8");
        String usr = req.getParameter("username");
        String pwd = req.getParameter("password");
        boolean validated = false;
        try {
            SqlSrvDBConn SqlSrvDB = SqlSrvDBConn.getInstance();
            ArrayList<User> userList = SqlSrvDB.userquery();
            User usercheck = (User) session.getAttribute("user");
            if (usercheck == null) {
                for (User user : userList) {
                    if (user.getUsername().trim().compareTo(usr) == 0) {
                        if (user.getPassword().compareTo(pwd) == 0) {
                            session.setAttribute("user", user);
                            validated = true;
                        }
                    }
                }
            }else {
                validated = true;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (validated) {
            out.print("<html><body>");
            out.print("ok,"+((User) session.getAttribute("user")).getUsername());
            out.print("<a href=validate.jsp>退出</a>");
            out.print("</body></html>");
        } else {
            out.print("<html><body>");
            out.print("用户名或密码错误");
            out.print("<a href=validate.jsp>返回</a>");
            out.print("</body></html>");
        }
    }
}
