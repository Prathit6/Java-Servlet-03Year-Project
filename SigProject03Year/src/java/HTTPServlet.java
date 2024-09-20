/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author prathit
 */
public class HTTPServlet extends HttpServlet {

    

   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
      PrintWriter out =resp.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HTTP Servlet</title>");
      out.println("<head>");
      out.println("<body bgcolor=cyan>");
      out.println("<h1>Hello! Welcome my HTTP Servlet-Get</h1>");
      out.println("<form action = HTTPServlet method=post >");
      out.println("<h2>UserName: <input type=text name=uname></h2>");
      out.println("<h2>UserName: <input type=text name=upass></h2>");
    out.println("<input type=submit>");
      out.println("</form>");
      out.println("</body>");
      out.println("</html>");
       //This code is not feasiable for programming we can make a html file sepreately for that
    
    }

 
  
 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
        
      String uname=req.getParameter("uname");
      String upass=req.getParameter("upass");
      
      PrintWriter out =resp.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HTTP Servlet</title>");
      out.println("<head>");
      out.println("<body bgcolor=cyan>");
      out.println("<h1>Hello all to my HTTP Servlet-Post</h1>");
     
      //out.println("<h2>Your User name is "+uname+"</h2>");
      //out.println("<h2>Your password is "+upass+"</h2>");
      if(uname!=null&&upass!=null&& !uname.trim().equals("") && uname.equalsIgnoreCase("prathit") && upass.equals("12345"))
      {
      out.println("<h2>Login sucssesful</h2>");
      }
      else{
      out.println("<h2>Login failed</h2>");
      }
      out.println("</body>");
      out.println("</html>");
    }

   

}
