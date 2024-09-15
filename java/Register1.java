

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register1
 */
@WebServlet("/Register1")
public class Register1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register1() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    
    	try {
    		
 
    		Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");  
			
			PrintWriter pw=response.getWriter();
            String name = request.getParameter("name");
          
           String mob = request.getParameter("mob");
           String add = request.getParameter("add");
           String email = request.getParameter("email");
           String pass = request.getParameter("pass");
           
           
           Statement stmt = con.createStatement();
         
           
        int c=stmt.executeUpdate("insert into sregister(name,mobile,address,email,password)values('"+name+"','"+mob+"','"+add+"','"+email+"','"+pass+"') ");
           
           pw.println("register sucess");
           if(c>0)
           System.out.println("successfully insert");
          /*  String redirectedPage = "/parentPage";
          response.sendRedirect("registrationsuccess.jsp");*/
        } catch (Exception ex) {
        	
           Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    	
    }




}
