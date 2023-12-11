package p1;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = Integer.parseInt(sc.nextLine());	
		System.out.println("Enter a Float Values: ");
		float num2 = Float.parseFloat(sc.nextLine());
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("Enter a new String : ");
		String str2 = sc.nextLine();
		sc.close();
		System.out.println("Num : "+num);
		System.out.println("Str: "+str);
		System.out.println("num2 : "+num2);		
	}
}
