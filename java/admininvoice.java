/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Oops
 */
public class admininvoice extends HttpServlet {

  
  /*  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           String name = request.getParameter("name");
          String rfees = request.getParameter("rfess");
           String time = request.getParameter("time");
          String mfees = request.getParameter("mfess");
          
          MyDB db = new MyDB();
           Connection con =db.getCon();
           Statement stmt = con.createStatement();
           
           stmt.executeUpdate("insert into invoice(name,rfees,mfess,time)values('"+name+"','"+rfees+"','"+mfees+"','"+time+"')");
           out.println("data is inserted");
        } catch (SQLException ex) {
            Logger.getLogger(admininvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	try {
Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");  
			 
    		PrintWriter out = response.getWriter(); 
            /* TODO output your page here. You may use following sample code. */
           String name = request.getParameter("name");
          String rfees = request.getParameter("rfess");
           String time = request.getParameter("time");
          String mfees = request.getParameter("mfess");
          
   
           Statement stmt = con.createStatement();
           
           stmt.executeUpdate("insert into invoice(name,rfees,mfess,time)values('"+name+"','"+rfees+"','"+mfees+"','"+time+"')");
           out.println("data is inserted");
        } catch (Exception ex) {
            Logger.getLogger(admininvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
