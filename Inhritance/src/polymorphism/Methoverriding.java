package polymorphism;
class Parent1{
	void m1(int a, int b)
	{
		System.out.println("a+b: "+(a+b));
	}
}
public class Methoverriding extends Parent1{
	//overriding
	void m1(int a, int b)
	{
		System.out.println("The sum of a+b: "+(a+b));
	}
	
	public static void main(String[] args) {
		new Methoverriding().m1(45, 85);
	}
}
