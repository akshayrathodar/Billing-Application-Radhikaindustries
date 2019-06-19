package bill;
public class BillBean
{
	private int bno;
	private String pnm;
	private String padd;
	private String mnm;
	private int qty;
	private int price;
	private int cgst;
	private int sgst;
	private int igst;
	private int ttax;
	private int netamount;
	private String state;
	private String date;
	private String gno;
	public BillBean(int eno,String pnm,String padd,String mnm,int qty,int price,int cgst,int sgst,int igst,int ttax,int netamount,String state,String date,String gno)
	{
		this.bno=eno;
		this.pnm=pnm;
		this.padd=padd;
		this.mnm=mnm;
		this.qty=qty;
		this.price=price;
		this.cgst=cgst;
		this.sgst=sgst;
		this.igst=igst;
		this.ttax=ttax;
		this.netamount=netamount;
		this.state=state;
		this.date=date;
		this.gno = gno;	
		
	}
	public int getBno()
	{
		return(bno);
	}
	public String getPnm()
	{
		return(pnm);
	}
	public String getPadd()
	{
		return(padd);
	}
	public String getMnm()
	{
		return(mnm);
	}
	public int getQty()
	{
		return(qty);
	}
	public int getPrice()
	{
		return(price);
	}
	public int getCgst()
	{
		return(cgst);
	}
	public int getSgst()
	{
		return(sgst);
	}
	public int getIgst()
	{
		return(igst);
	}
	public int getTtax()
	{
		return(ttax);
	}
	public int getNetamount()
	{
		return(netamount);
	}
	public String getState()
	{
		return(state);
	}
	public String getDate()
	{
		return(date);
	}
	public String getGno()
	{
		return(gno);
	}	
}