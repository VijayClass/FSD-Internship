package stringtoken;

import java.util.StringTokenizer;

public class DemoStToken {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello World, welcome to Java");
		System.out.println(st.countTokens());
		
		while (st.hasMoreElements()) {
			System.out.println("Count : "+st.countTokens());
			System.out.println(st.nextToken());	
		}
	}
}	
