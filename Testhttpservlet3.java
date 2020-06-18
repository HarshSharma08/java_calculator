/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import db.dbconnector;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Harsh
 */
public class Testhttpservlet3 extends HttpServlet {
  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.sendRedirect("login.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String tablepassword=null;
       
        Statement st;
        ResultSet rs;
     
        try
        {
            st=dbconnector.getStatement();
         
            String Query="Select password  from emp where empname='"+username+"' ";
            System.out.println("query="+Query+"");
            
            rs=st.executeQuery(Query);
            
            if(rs.next())
            {
                tablepassword=rs.getString(1);
            }

        }
        catch( SQLException e)
        {
            System.out.println(e);
        }
        
       PrintWriter out=response.getWriter(); 
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE> My First httpServlet2-POST</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=cyan>");
        out.println("<H1>Hello from my first httpServlet2-POST</H1>");
        //out.println("<h2> Username="+username+" <h2/>");
        //out.println("<h2> Password="+password+" <h2/>");
       if(username!=null && password!=null && !username.trim().equals("") && password.equals(tablepassword))
       {
           response.sendRedirect("home.html");
        //out.println("<h2>login successful</h2>");
        //out.println("<BR/>");
       }
       else
       {
           response.sendRedirect("login.html");
           //out.println("Login failed");
       }
       out.println("</BODY>");
       out.println("</HTML>"); 
    }
}
