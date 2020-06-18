/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Harsh
 */
public class Testhttpservlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE> My First httpServlet2-GET</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=cyan>");
        out.println("<FORM action=Testhttpservlet2 method=POST>");
        out.println("<H1>Hello from my first httpServlet2-GET</H1>");
        out.println("Username: <input type=text name=username>");
        out.println("<BR/>");
        out.println("Password: <input type=password name=password>");
        out.println("<BR/>");
        out.println("<INPUT TYPE=submit >");
        out.println("</FORM>");
        out.println("</BODY>");
        out.println("</HTML>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        PrintWriter out=response.getWriter(); 
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE> My First httpServlet2-POST</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=cyan>");
        //out.println("<H1>Hello from my first httpServlet2-POST</H1>");
        //out.println("<h2> Username="+username+" <h2/>");
        //out.println("<h2> Password="+password+" <h2/>");
       if(username!=null && password!=null && !username.trim().equals("") && username.equalsIgnoreCase("Harsh") && password.equals("12345"))
       {
        out.println("login successfull");
        out.println("<BR/>");
       }
       out.println("</BODY>");
       out.println("</HTML>"); 
    }
}
