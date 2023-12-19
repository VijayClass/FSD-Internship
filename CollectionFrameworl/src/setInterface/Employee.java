package setInterface;

import java.util.*;

public class Employee {
	String name;

	public Employee(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Set<Employee> ob = null;
		Scanner sc = new Scanner(System.in);	
		System.out.println("1.HashSet\n2.LHS\n3.Tree");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			ob = new HashSet<Employee>();
			break;
		case 2:
			ob = new LinkedHashSet<Employee>();
			break;
		case 3:
			ob = new TreeSet<Employee>();
			break;
			
		}
		
		ob.add(new Employee("Vijay"));
		for(Employee temp : ob)
			System.out.println(temp.toString());
	}
		
}
