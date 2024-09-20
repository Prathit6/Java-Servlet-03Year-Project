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

import java.sql.Connection;
import java.sql.Statement ;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author prathit
 */
public class NewhttpServlet1 extends HttpServlet {

    

   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
       resp.sendRedirect("login.html");
    
    }

 
  
 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
    Connection con = null;
       Statement st = null;
       ResultSet rs =null;
       String uname=req.getParameter("uname");
      String upass=req.getParameter("upass");
      String Tablepass=null;
       
       try{
       
           Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver loaded!");
          



          
         
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?charecterEncoding=latinl","prathit-dode","@ptcdode1");
       
       System.out.println("connected");
       
       
       st = con.createStatement();
       
       String query ="select * from emp from empname='"+uname+"'";
       
       rs =st.executeQuery("query= "+query);
       
       while(rs.next()){
       
     
             System.out.print(rs.getString(1)+"\t");  
             System.out.print(rs.getString(2)+"\t");
             System.out.print(rs.getString(3)+"\t");
             System.out.print(rs.getString(4)+"\n");
       
       
       }
       con.close();
       
    } 
       catch(ClassNotFoundException e){
       
           System.out.println(e);
       
       }
       catch(SQLException e){
           
           System.out.println(e);
       }
       
    
     
      
      
      PrintWriter out =resp.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HTTP Servlet</title>");
      out.println("<head>");
      out.println("<body bgcolor=cyan>");
      out.println("<h1>Hello all to my HTTP Servlet-Post</h1>");
     
      //out.println("<h2>Your User name is "+uname+"</h2>");
      //out.println("<h2>Your password is "+upass+"</h2>");
      if(uname!=null && upass!=null&& !uname.trim().equals("") && uname.equalsIgnoreCase("prathit") && upass.equals("12345"))
      {
          resp.sendRedirect("home.html");
      //out.println("<h2>Login sucssesful</h2>");
      }
      else{
          resp.sendRedirect("login.html");
     // out.println("<h2>Login failed</h2>");
      }
      out.println("</body>");
      out.println("</html>");
    }

   

}


