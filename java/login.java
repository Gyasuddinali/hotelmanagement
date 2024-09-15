/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Oops
 */

@WebServlet("/login")
public class login extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	
    	try {
    		PrintWriter out = response.getWriter(); 
    	
Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");  
			
    		
          String email = request.getParameter("useremail");
           
           String pass = request.getParameter("userpass");
          
       PreparedStatement pst=con.prepareStatement("select id,email,password from admin where email=? and password=?");
        //  ResultSet rs1 = stmt.executeQuery("select id,email,password from admin where email = '"+email+"' and password = '"+pass+"'"); 
        pst.setString(1, email);
        pst.setString(2,pass);
       ResultSet rs=pst.executeQuery();
    		   if(rs.next()) {
           
          response.sendRedirect("admin.jsp");    
          }
       
            
            
        } catch (Exception ex) {
           // Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("wrong.jsp");
        }
    	
    	
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
