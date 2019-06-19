package marks;
public class MarkBean
{
	private int eno;
	private String name;
	public MarkBean(int eno,String name)
	{
		this.eno=eno;
		this.name=name;
	}
	public int getEno()
	{
		return(eno);
	}
	public String getName()
	{
		return(name);
	}
}