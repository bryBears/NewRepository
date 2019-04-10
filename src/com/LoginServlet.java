package com;

import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "com.LoginServlet",urlPatterns = "/loginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
        System.out.println(username + ":" + pass);

        PrintWriter pw = response.getWriter();
        if (username.equals("xiabocheng") && pass.equals("12345")) {
            pw.println("login succed");
            response.sendRedirect("/login.html");
        } else {
            pw.println("login fail.");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
