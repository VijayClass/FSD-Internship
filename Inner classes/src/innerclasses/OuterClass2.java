package innerclasses;

public class OuterClass2 {
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
	
	class Innerclass{
		int c = 30;
		static int d = 40;
		void im1()
		{
			System.out.println(c+" "+d+" "+ b+" "+a);
		}
	}
	
	public static void main(String[] args) {
		OuterClass2.Innerclass object = new OuterClass2().new Innerclass();
		object.im1();
	}
}
