import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;
import bill.*;

public class bills extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		try 
		{
	         Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bill","root","");	
			Statement st=cn.createStatement();
			
		int bno = Integer.parseInt(req.getParameter("bno"));
		String pnm = req.getParameter("pnm");
		String padd = req.getParameter("padd");
		String state = req.getParameter("state");
		String date = req.getParameter("dt");
		String mnm = req.getParameter("mnm");
		String gno = req.getParameter("gno");
		int qty = Integer.parseInt(req.getParameter("qty"));
		int price = Integer.parseInt(req.getParameter("price"));
		int cgst=0;
		int sgst=0;
		int igst=0;
		int ttax=0;
		int netamount=0;
				if(state.equals("gujarat"))
				{
					cgst = (price*9)/100;
					sgst = (price*9)/100;
					ttax = cgst+sgst;
				}
				else
				{
					igst = (price*18)/100;
					ttax=igst;
				}
		netamount = cgst+sgst+igst+price;
		out.println("<HTML>");
		out.println("<BODY BGCOLOR=\"#FDF5E6\"><CENTER>");
		out.println(bno +pnm + padd + date + mnm + qty + price +cgst+sgst+igst+ttax+netamount+"</CENTER></BODY></HTML>");
		st.executeUpdate("insert into bill values("+bno+",'"+pnm+"','"+padd+"','"+mnm+"',"+qty+","+price+","+cgst+","+sgst+","+igst+","+ttax+","+netamount+",'"+state+"','"+date+"','"+gno+"')");	
		BillBean bb = new BillBean(bno,pnm,padd,mnm,qty,price,cgst,sgst,igst,ttax,netamount,state,date,gno);
		req.setAttribute("binv",bb);
		RequestDispatcher dispatcher=
req.getRequestDispatcher("/WEB-INF/jsp/mypage.jsp");

		dispatcher.forward(req,res);
		
		}
		catch(Exception e)
		{
			out.println("Exception :"+e);
		}
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		doGet(req,res);
	}
}