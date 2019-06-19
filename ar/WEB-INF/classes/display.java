import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import dr.*;
import word.*;

public class display extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
   		String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
      	String DB_URL="jdbc:mysql://localhost/bill";
		int bno=Integer.parseInt(request.getParameter("bno"));
		String pnmh=request.getParameter("pnmh");
		String dfs =request.getParameter("dfs");
		boolean ans=false;
		
      	String USER = "root";
      	String PASS = "";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "No Bill Number or Party's Name or Date Found";
		System.out.println(dfs);
      	out.println("<html>" +"<head><title><h2>" + title + "</h2></title></head>" +"<body bgcolor = \"#f0f0f0\"><center>" +"<h1 align = \"center\">" + title+dfs + "</h1>");
					
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		Statement stmt = conn.createStatement();
		String sql=null;
		if(bno!=0)
		{
		sql = "SELECT * FROM bill where bno='"+bno+"'";
		}
		else if(!pnmh.equals(""))
		{
		sql = "SELECT * FROM bill where pnm='"+pnmh+"'";
		}
		else if(!dfs.equals(null))
		{
		sql = "SELECT * FROM bill where date='"+dfs+"'";		
		}
		else
		{
			ans=true;
		}
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);
		
		// Extract data from result set
		
        while(rs.next())
		{	
			int mbno = rs.getInt("bno");
			String pnm = rs.getString("pnm");
			String padd = rs.getString("padd");
			String state = rs.getString("state");
			String date = rs.getString("date");
			String mnm = rs.getString("mnm");
			int qty = rs.getInt("qty");
			int price = rs.getInt("price");
			int cgst=rs.getInt("cgst");
			int sgst=rs.getInt("sgst");
			int igst=rs.getInt("igst");
			int ttax=rs.getInt("ttax");
			int netamount=rs.getInt("netamount");
			long wrd = netamount;
			String gno = rs.getString("gstno");
			//Retrieve by column name	
		
			//Display values
		check chk = new check();
		String ew = null;
         ew = chk.EnglishNumber(wrd);
		if(ans==false)
		{
		DispBean db = new DispBean(mbno,pnm,padd,mnm,qty,price,cgst,sgst,igst,ttax,netamount,state,date,ew,gno);
		request.setAttribute("abc",db);
		RequestDispatcher dp = request.getRequestDispatcher("/WEB-INF/classes/myjsp.jsp");
		dp.forward(request,response);
		}
	
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