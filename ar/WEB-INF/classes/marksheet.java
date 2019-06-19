import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import marks.*;
public class marksheet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		int eno;
		String name;
		eno=Integer.parseInt(req.getParameter("eno"));
		name="Kalpesh";
		MarkBean mb = new MarkBean(eno,name);
		req.setAttribute("mksheet",mb);
		RequestDispatcher dispatcher=req.getRequestDispatcher("/WEB-INF/jsp/mypage.jsp");
		dispatcher.forward(req,res);
	}
}