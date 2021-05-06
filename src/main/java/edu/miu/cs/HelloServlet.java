package edu.miu.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Calculator")
public class HelloServlet extends HttpServlet {



    @Override
    public void init() throws ServletException {
        System.out.println("in init...");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();

        if(!req.getParameter("addFirstNum").isEmpty() && !req.getParameter("addSecondNum").isEmpty()) {
            int a1 = Integer.parseInt(req.getParameter("addFirstNum"));
            int a2 = Integer.parseInt(req.getParameter("addSecondNum"));
            int add = a1+a2;
            out.println(a1 + " + " + a2 + " = " + add + "<br>");
        }

        if(!req.getParameter("multFirstNum").isEmpty() && !req.getParameter("multecondNum").isEmpty()) {
            int m1 = Integer.parseInt(req.getParameter("multFirstNum"));
            int m2 = Integer.parseInt(req.getParameter("multecondNum"));
            int mult = m1*m2;
//            req.setAttribute(mult, );
            out.println(m1 + " * " + m2 + " = " + mult + "<br>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        System.out.println("in destroy...");
    }
}
