/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
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
 * @author prathit
 */
public class NewServlet implements Servlet {

public void init(ServletConfig config) throws ServletException {
        System.out.println("init Method");
       
    }
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
      PrintWriter out =res.getWriter();//out ko hum apne tarah se costomoze kar sakte hai ki vo 
                                      //kaha data print karega browser per ya consol per 
      out.println("<html>");
         out.println("<head>");
            out.println("<title>my first Servlet</title>");
               out.println("<head>");
                  out.println("<body bgcolor=cyan>");
                     out.println("<h1>Hello all to my first Servlet</h1>");
                  out.println("</body>");
                     out.println("</html>");
       
    }
 
    public ServletConfig getServletConfig() {
          
        return null;
   
       
    }
    

    
   
    public String getServletInfo() {
        return null;
       
    }

  
    public void destroy() {
         
      System.out.println("DSistroy Method");
       
    }
 
}
