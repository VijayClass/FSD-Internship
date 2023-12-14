package empwithArray;

import java.util.Scanner;

public class Employee {
	String empname,id;
	float bsal;
	
	public Employee(String empname, String id, float bsal) {
		this.empname = empname;
		this.id = id;
		this.bsal = bsal;
	}
	float calSal()
	{
		return bsal + 0.18f*bsal + 0.07f*bsal;
	}
	void getDetails()
	{
		System.out.println("Name : "+this.empname);
		System.out.println("ID : "+this.id);
		System.out.println("Tsal : "+this.calSal());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Emp: ");
		Employee[] emparr = new Employee[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<emparr.length;i++)
		{
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			System.out.println("Enter id: ");
			String id = sc.nextLine();
			System.out.println("Enter bsal : ");
			float bsal = Float.parseFloat(sc.nextLine());
			emparr[i] = new Employee(name, id, bsal);
		}
		for(Employee temp:emparr)
			temp.getDetails();
			
	}
}
