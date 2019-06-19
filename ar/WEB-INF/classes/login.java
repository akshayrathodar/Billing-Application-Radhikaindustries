import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class login extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
   		String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
      	String DB_URL="jdbc:mysql://localhost/bill";
		String unm=request.getParameter("unm");
		String pwd =request.getParameter("pwd");
      	String USER = "root";
      	String PASS = "";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Login Failed";
		
      	out.println("<html>" +"<head><title><h2>" + title + "</h2></title></head>" +"<body bgcolor = \"#f0f0f0\"><center>" +"<h1 align = \"center\">" + title+unm+pwd + "</h1>");
					
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		Statement stmt = conn.createStatement();
		String sql=null;
		
		sql = "SELECT * FROM login where unm='"+unm+"' && pwd='"+pwd+"'";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		// Extract data from result set
		String username=null;
		String password=null;
        while(rs.next())
		{	
			 username = rs.getString("unm");
			 password = rs.getString("pwd");
			System.out.println(username);
			System.out.println(password);
			//Retrieve by column name	
		
			//Display values		
			
       	}	
		if(unm.equals(username) || pwd.equals(password))
			{
			response.sendRedirect("main.html");
				out.println("Ho Gya Bhai	");
			}
		
		
        out.println("</center></body></html>");
				

         	// Clean-up environment
         	rs.close();
         	stmt.close();
         	conn.close();
    } 
	
	catch(Exception e) 
	{
         		//Handle errors for Class.forName
		out.println(e);
	} 
	
	}
} 