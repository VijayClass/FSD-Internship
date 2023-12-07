package p2;

public class Product1 {
	String pname,pid;
	float pprice;
	int pqty;
	Product1(String ppname,String ppid,float ppprice,int ppqty)
	{
		this.pname = ppname;
		this.pid = ppid;
		this.pprice = ppprice;
		this.pqty = ppqty;
	}
	void getdetails()
	{
		System.out.println(this.pname+"\t"+this.pprice);
	}
	public static void main(String[] args) {
		Product1 p1 = new Product1("Mouse","A1",741.25f,54);
		Product1 p2 = new Product1("CDDR","A2",845.54f,14);
		Product1 p3 = new Product1("FDDR","A3",842.55f,74);
		
		System.out.println("Price: "+p2.pprice);
	}
	
	
}
