import java.sql.*;
import java.util.*;
import java.io.*;
class insert_record
{
	public static void main (String args[])
	{
		try
		{
			try{
	             Class.forName("com.mysql.jdbc.Driver");
			}catch(Exception e){System.out.println(e);}
                        //String servername="localhost";
                        //String portno="3306";
                        //String username="root";
                        //String password="";
	                //String url = ""jdbc:mysql://localhost:3306/kalpesh","root","";
                        //System.out.println(url);

			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");

			
			Statement st=cn.createStatement();

			DataInputStream din = new DataInputStream(System.in);
			int pno=Integer.parseInt(din.readLine());
			System.out.flush();

			DataInputStream din1 = new DataInputStream(System.in);
			String pnm=din1.readLine();
			System.out.flush();

			DataInputStream din2 = new DataInputStream(System.in);
			int price=Integer.parseInt(din2.readLine());
			System.out.flush();

			try
			{
				int x=st.executeUpdate("insert into product values("+pno+",'"+pnm+"',"+price+")");

				System.out.println("No Of Rows Affected : "+x);
			}
			
			catch(Exception e)
			{
				System.out.println("Exception : "+e);
			}
			st.close();
			cn.close();
                        cn=null;
		}
		catch(Exception e)
		{
			System.out.println("Exception : "+e);
		}
	}
}
