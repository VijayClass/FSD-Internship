package stringjoinerexp;

import java.util.StringJoiner;

public class DemoStJoiner {
	int num = 10;
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("-"),sj2 = new StringJoiner("/");
		sj.add("12").add("5").add("2023").add("Java");
		System.out.println(sj.toString());
		sj2.setEmptyValue("sj2 is empty");
		System.out.println(sj2);
		sj2.add("Hello");
		System.out.println(sj2);
		
	}
}
