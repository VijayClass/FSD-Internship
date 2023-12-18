
public class Execution {
	public static void main(String[] args) {
		Itest ob = (int a)->{
			System.out.println("This is a:"+a);
		};		
		ob.access(741);
	}
}
