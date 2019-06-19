package dr;
public class DispBean
{
		private int id;
		private int age;
		private String first;
		private String last;
		private String ew;
		public DispBean(int id,int age,String first,String last,String ew)
		{
			this.id = id;
			this.age = age;
			this.first= first;
			this.last = last;
			this.ew = ew;
		}
		public int getId()
		{
		 return(id);
		}
		public int getAge()
		{
		 return(age);
		}
		public String getFirst()
		{
		 return(first);
		}
		public String getLast()
		{
		 return(last);
		}
		public String getEw()
		{
			return(ew);
		}
		
}