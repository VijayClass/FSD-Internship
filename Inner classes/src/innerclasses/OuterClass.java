package innerclasses;

public class OuterClass {
	int a = 10;
	static int b= 20;
	void m1()
	{
		System.out.println(a+" "+b);
	}
	static void smethod()
	{
		System.out.println(b);
	}
	
	static class Innerclass{
		int c = 30;
		static int d = 40;
		void im1()
		{
			System.out.println(c+" "+d+" "+ b);
		}
	}
	
	public static void main(String[] args) {
		OuterClass.Innerclass object = new OuterClass.Innerclass();
		object.im1();
	}
}
