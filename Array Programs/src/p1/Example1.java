package p1;
import java.util.Scanner;
public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Size: ");
		int[] arr = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("arr["+i+"] : ");		
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println("\n Using new ENhanced for Loop");
		for(int temp : arr )
			System.out.print (temp+" ");
		sc.close();
	}
}
