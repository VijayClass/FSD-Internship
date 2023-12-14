package p2;

public interface Concretemeths {
	void m1();
	default void m2()
	{
		this.m5();
		Concretemeths.m4();
	}
	static void m3()
	{
		
	}
	private static void m4()
	{
		
	}
	private void m5() {
		
	}
}
