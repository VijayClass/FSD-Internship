package anonymousinnerclass;

public class Pclass {
	void m1()
	{
		System.out.println("This is parent class m1 method");
	}
	public static void main(String[] args) {
		Pclass ob = new Pclass() {
			void m1()
			{
				System.out.println("This is m1 method of Anymous inner");
			}
			void m2()
			{
				System.out.println("This is m2 methods");
			}
		};
		ob.m1();
		Itest ob2 = new Itest() {
			@Override
			public void access() {
				System.out.println("this is access");
			}
		};
		ob2.access();
	}
}
