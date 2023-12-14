package p1;

public class Example1 {
	public static void main(String[] args) {
		String str = "Java Programming ",str2 ="Hello";
		
		System.out.println(str.length());
		System.out.println(str2.isEmpty());
		for(int i=0;i<str.length();i++)
		System.out.print(str.charAt(i)+ " ");
		System.out.println();
		System.out.println(str.startsWith("Pro",5));
		System.out.println(str.endsWith("in"));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 9));
		System.out.println(str2.concat(str));
		System.out.println(str2);
		System.out.println(str.replace('a', 'c'));
		System.out.println(str.replaceFirst("av", str2));
		System.out.println(str.replaceAll("[av]", "Python"));
		System.out.println(str.contains("Java"));
		String arr[] = str.split(" ");//java|programming
		System.out.println(arr[1]);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		String text = String.valueOf(8753547542l);
		System.out.println(text.charAt(5));
		System.out.println(String.valueOf(564));
		char[] arr2 = str.toCharArray();
		System.out.println(arr2[8]);
		System.out.println("Hello".compareTo("Hello"));
	}
}
