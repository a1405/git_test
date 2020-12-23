package com.lq.mvn.gitweb;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello9
        // Hello9
        // Hello9
        // Hello9
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>111" + message + "222<h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}