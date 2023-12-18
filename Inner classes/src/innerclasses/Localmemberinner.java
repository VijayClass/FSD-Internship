package innerclasses;

public class Localmemberinner {
	int a = 10;
	static int b = 20;
	void m1()
	{
		class Inner1{
			int c = 20;
			static int d = 40;
			void m1()
			{
				System.out.println(c+" "+d+" "+b+" "+a);
			}
		}
		
		new Inner1().m1();
	}
	static void m2()
	{
		class Inner2{
			int c = 20;
			static int d = 40;
			void m1()
			{
				System.out.println(c+" "+d+" "+b);
			}
		}
		new Inner2().m1();
	}
	public static void main(String[] args) {
		new Localmemberinner().m1();
		Localmemberinner.m2();
	}
}
