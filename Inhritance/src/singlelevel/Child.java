package singlelevel;
class Parent{
	
	int a =10;
	void m1()
	{
		System.out.println("This is m1 of parent"+this.a);
	}
	static void m2()
	{
		System.out.println("This is m2 of parent");
	}
}
public class Child extends Parent{
	void xy()
	{
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		new Child().m1();
		System.out.println(new Child().a);
		Child.m2();
	}
}
