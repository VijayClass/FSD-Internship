package p1;

public class Iclass implements Itest {
	//overriding
	public void resolve()
	{
		System.out.println("hello");
	}

	
	public void m1() {
		
	}
	public static void main(String[] args) {
		new Iclass().resolve();
	}
	
}
