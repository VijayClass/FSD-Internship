package p1;

public class Task2 implements Runnable{

	@Override
	public void run() {
		for(int i=220;i<240;i++)
		{
			System.out.println("--j: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
