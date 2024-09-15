

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginAdmin
 */
@WebServlet("/LoginAdmin")
public class LoginAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		

    	try {
    		PrintWriter out = response.getWriter(); 
    	
Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");  
			
    		
          String email = request.getParameter("email");
           
           String pass = request.getParameter("pass");
          
       PreparedStatement pst=con.prepareStatement("select id,email,password from admin where email=? and password=?");
        //  ResultSet rs1 = stmt.executeQuery("select id,email,password from admin where email = '"+email+"' and password = '"+pass+"'"); 
        pst.setString(1, email);
        pst.setString(2,pass);
       ResultSet rs=pst.executeQuery();
    		   if(rs.next()) {
    			   response.setContentType("text/html");
    				  RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
    			  rd.forward(request, response);
         // response.sendRedirect("admin.jsp");    
          }
       
            
            
        } catch (Exception ex) {
           // Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("wrong.jsp");
        }
    	
    	
    }

		
	}


