package p1;

public class StringComparisions {
	public static void main(String[] args) {
		String s1 = "Java",s2 = "Java",s3 = new String("Java"),s4 = new String("Java");
		
		if(s1 == s2)
			System.out.println("Same");
		else
			System.out.println("Not Same");
		
		if(s3 == s4)
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}
