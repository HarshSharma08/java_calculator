/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Harsh
 */
public class TestServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("intit method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;  
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE> First Servlet </TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=cyan>");
        for(int i=0;i<10;i++)
        {
        out.println("<H1>Hello from my first servlet </H1>");
        }
        out.println("</BODY>");
        out.println("</HTML>");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method");
    }

    @Override
    public String getServletInfo() {
        return null;
    }
   
     
  
}
