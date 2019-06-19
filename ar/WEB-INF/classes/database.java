import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;
import java.io.*;
 
public class database extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
   		String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Database Result";
	 	
      	out.println("<html>\n" +"<head><title>" + title + "</title></head>\n" +"<body bgcolor = \"#f0f0f0\">\n" +"<h1 align = \"center\">" + title + "</h1>\n");

	try 
	{
	         Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");

			
			Statement st=cn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM employees");

        while(rs.next())
		{		
			int id  = rs.getInt("id");		
			int age = rs.getInt("age");		
			String first = rs.getString("first");
			String last = rs.getString("last");

			out.println("ID: " + id + "<br>");
			out.println("Age: " + age + "<br>");
			out.println("First: " + first + "<br>");
        	out.println("Last: " + last + "<br>");
       	}
        out.println("</body></html>");
         	rs.close();
         	st.close();
         	cn.close();


    } 
	catch(Exception e) 
	{
			out.println("error ="+e);
    	} 
	 
	
	}
} 