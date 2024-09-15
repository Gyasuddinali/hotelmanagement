

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminInvoice1
 */
@WebServlet("/AdminInvoice1")
public class AdminInvoice1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminInvoice1() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
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

}
