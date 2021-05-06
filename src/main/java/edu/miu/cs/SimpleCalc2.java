package edu.miu.cs;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SimpleCalc2 extends HttpServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("in init...");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int a1 = Integer.parseInt(req.getParameter("addFirstNum1"));
        int a2 = Integer.parseInt(req.getParameter("addSecondNum1"));
        int m1 = Integer.parseInt(req.getParameter("multFirstNum1"));
        int m2 = Integer.parseInt(req.getParameter("multecondNum1"));
        PrintWriter out = resp.getWriter();
        out.println("<style>\n" +
                "        input {\n" +
                "            padding: 10px;\n" +
                "            width: 15%;\n" +
                "        }\n" +
                "\n" +
                "        form {\n" +
                "            width: 500px;\n" +
                "            margin: 0 auto;\n" +
                "            text-align-last: center;\n" +
                "        }\n" +
                "\n" +
                "        h1 {\n" +
                "            text-align: center;\n" +
                "            padding-top: 2em;\n" +
                "        }\n" +
                "\n" +
                "    </style>");
        
        
        
       out.println("<h1>Simple calculator 1</h1>");
       out.println("<form action='Calculator' method='get'>");
       out.println("<input id='addFirstNum' name='addFirstNum' type='number' value=''>");
       out.println("<span> + </span>");
       out.println("<input id='addSecondNum' name='addSecondNum' type='number' value=''>");
       out.println("<br><br>");
       out.println("<input id='multFirstNum' name='multFirstNum' type='number' value=''>");
       out.println("<span> * </span>");
       out.println("<input id='multecondNum' name='multecondNum' type='number' value=''>");
       out.println("<br><br>");
       out.println("<input type='submit' value='Submit'>");
       out.println("</form>");
        
        
        
        out.println("<h1>Simple calculator 2</h1>");
        out.println("<form action='#' method='get'>");
        out.println("<input type='number' id='addFirstNum1' name='addFirstNum1' value='"+ a1 +"'>");
        out.println("<span> + </span>");
        out.println("<input type='number' id='addSecondNum1' name='addSecondNum1' value='"+ a2 +"'>");
        out.println("<span> = </span>");


        if (!req.getParameter("addFirstNum1").isEmpty() && !req.getParameter("addSecondNum1").isEmpty()) {
            int add = a1 + a2;
            out.println("<input type='number' id='addResult1' name='addResult1' value='" + add + "' disabled><br><br>");
        }

        out.println("<input type='number' id='multFirstNum1' name='multFirstNum1' value='"+ m1 +"'>");
        out.println("<span> * </span>");
        out.println("<input type='number' id='multecondNum1' name='multecondNum1' value='"+ m2 +"'>");
        out.println("<span> = </span>");

        if (!req.getParameter("multFirstNum1").isEmpty() && !req.getParameter("multecondNum1").isEmpty()) {
            int mult = m1 * m2;
            out.println("<input type='number' id='multResult1' name='multResult1' value='" + mult + "' disabled><br><br>");
        }

        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        System.out.println("in destroy...");
    }
}
