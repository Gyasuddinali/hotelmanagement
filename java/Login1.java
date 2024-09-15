

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login1
 */
@WebServlet("/Login1")
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		try {
//    		PrintWriter out = response.getWriter(); 
//    	
//Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");  
//			
//    		
//          String email = request.getParameter("email");
//          
//           String bhu = request.getParameter("bhu");
//           
//           String pass = request.getParameter("pass");
//           
//          
//           Statement stmt = con.createStatement();
//           if(bhu.equals("student"))
//           {
//           ResultSet rs = stmt.executeQuery("select sid,email,password from sregister where email = '"+email+"' and password = '"+pass+"'"); 
//           rs.next();
//           String n = rs.getString("sid");
//           HttpSession session=request.getSession();  
//           session.setAttribute("uname",n);
//          String redirectedPage = "/parentPage";
//          response.sendRedirect("welcome.jsp");
//           }
//          
//        
//          // else if(bhu.equals("admin")){
//           if("Admin".equals(bhu)) {
		
//           ResultSet rs1 = stmt.executeQuery("select id,email,password from admin where email = '"+email+"' and password = '"+pass+"'"); 
//           rs1.next();
//            
//                
//        	   
//          response.sendRedirect("admin.jsp");
//        }
//          
//          
//            
//        } catch (Exception ex) {
//           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//    	  response.sendRedirect("wrong.jsp");
//            
//        }
//    	
    	
	
		
		
		
		
		
		
		try {
    		PrintWriter out = response.getWriter(); 
    	
Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","919924");  
			
    		
          String email = request.getParameter("email");
          
          // String bhu = request.getParameter("bhu");
           
           String pass = request.getParameter("pass");
           
          
           //Statement stmt = con.createStatement();
           PreparedStatement pst=con.prepareStatement("select sid,email,password from sregister where email=? and password=?");
          pst.setString(1, email);
          pst.setString(2, pass);
           ResultSet rs=pst.executeQuery();
          if(rs.next()) {
           String n = rs.getString("sid");
           HttpSession session=request.getSession();  
           session.setAttribute("uname",n);
         // String redirectedPage = "/parentPage";
           RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
        	rd.forward(request, response);	 
           //  response.sendRedirect("welcome.jsp");
           }
          
        
          // else if(bhu.equals("admin")){
//           if("Admin".equals(bhu)) {
 
//          
//              
//String email1=request.getParameter("aemail");
//String pass1=request.getParameter("apass");
//
//          PreparedStatement pst1=con.prepareStatement("select id,email,password from admin where email=? and password=?");
//       pst.setString(1, email1);
//       pst.setString(2, pass1);
//ResultSet rs1=pst1.executeQuery();  
//if(rs1.next()) {
//			  response.sendRedirect("admin.jsp");
//			         
//}
            
        } catch (Exception ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
    	  response.sendRedirect("wrong.jsp");
            
        }
    	
		
		
		
		
	}

}
