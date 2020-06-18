
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Harsh
 */
public class TestGenericServlet extends GenericServlet {

    @Override
    public void service(ServletRequest requset, ServletResponse response) throws ServletException, IOException {
       PrintWriter out=response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");   
        out.println("<TITLE> My First GenericServlet </TITLE>");
        out.println("</HEAD>");
        out.println("<BODY bgcolor=cyan>");
        for(int i=0;i<10;i++)
        {
        out.println("<H1>Hello from my first GenericServlet</H1>");
        }
        out.println("</BODY>");
        out.println("</HTML>");
    }


}
