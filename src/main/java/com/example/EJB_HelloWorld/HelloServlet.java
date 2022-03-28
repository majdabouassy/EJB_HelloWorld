package com.example.EJB_HelloWorld;

import java.io.*;
import javax.ejb.EJB;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    private String message;
    @EJB(name="MyEjb", beanInterface=MyFirstSessionRemote.class)
    private MyFirstSessionRemote myFirstSessionBean;
    public void init() {
        message = myFirstSessionBean.sayHello();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}