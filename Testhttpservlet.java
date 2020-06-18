
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harsh
 */
public class Testhttpservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE> My First httpServlet </TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=cyan>");
        out.println("<H1>Hello from my first httpServlet</H1>");
        out.println("</BODY>");
        out.println("</HTML>");
        
    }

}
