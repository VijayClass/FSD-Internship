package stringbufferexamples;

public class Example {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.capacity());
		sb.append(" World");
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		sb.append("Aesdgbseargeraesf");
		System.out.println(sb.capacity());
		sb.reverse();
		System.out.println(sb.toString());
		sb.replace(2, 4,"Python");
		System.out.println(sb);	
	}
}
