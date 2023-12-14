package switchexap;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		switch(sc.nextLine())
		{
		case "Abc":
			System.out.println("im in case 1");
			
		case "Def":
			System.out.println("Im in case 2");
			
		case "Ghi":
			System.out.println("Im In case 3");
			break;
		default:
			System.out.println("Default case");
		}
		sc.close();
	}
}
