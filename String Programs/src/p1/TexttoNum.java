package p1;
import java.util.Scanner;
public class TexttoNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase().replaceAll("[abc]","2")
				.replaceAll("[def]","3").replaceAll("[ghi]","4")
				.replaceAll("[jkl]","5").replaceAll("[mno]","6")
				.replaceAll("[pqrs]","7").replaceAll("[tuv]","8")
				.replaceAll("[wxyz]","9");
		System.out.println(str.toString());
		sc.close();
	}
}


