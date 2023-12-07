package p1;

public class Product {
	String pname,pid;
	float pprice;
	int pqty;
	void setDetails(String ppname,String ppid,float ppprice,int ppqty)
	{
		this.pname = ppname;
		this.pid = ppid;
		this.pprice = ppprice;
		this.pqty = ppqty;
	}
	public static void main(String[] args) {
		Product p1 = new Product(),p2 = new Product(), p3 = new Product();
		
		p1.pname = "Mouse";
		p1.pid = "A111";
		p1.pprice = 457.54f;
		p1.pqty = 74;
		
		p2.setDetails("CDDR","A122",584.56f,58);
		
		p3.pname = "FDDR";
		
		System.out.println("Price: "+p2.pprice);
	}
	
	
}
