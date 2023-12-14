package p1;

public class Executor {
	public static void main(String[] args) {
		
		new Thread(new Task1()).start();
		
		Task2 t2 = new Task2();
		Thread thread2 = new Thread(t2);
		thread2.start();
	}
}
