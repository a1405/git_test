package com.lq.mvn.gitweb;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/user-servlet")
public class UserServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "User World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello9
        // Hello2
        // Hello3
        // Hello4
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>111" + message + "222<h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}