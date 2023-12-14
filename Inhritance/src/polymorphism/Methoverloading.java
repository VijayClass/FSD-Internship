package polymorphism;
class Parent2{
	void m1(int a, int b)
	{
		System.out.println("a+b: "+(a+b));
	}
}
public class Methoverloading extends Parent2{
	
	void m1(int a, int b, int c)
	{
		System.out.println("3 para");
	}
	void m1(int a, float b)
	{
		System.out.println("The sum of a+b: "+(a+b));
	}
	
	public static void main(String[] args) {
		
		new Methoverloading().m1(55, 46,1);
	}
}
