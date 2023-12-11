package EmployeeusingScanner;
import java.util.Scanner;
public class Employee {
	String name,id;
	float bsal;
	Employee(String name, String id, float bsal)
	{
		this.name = name;
		this.id = id;
		this.bsal = bsal;
	}
	void getDetails()
	{
		System.out.println("Name: "+this.name);
		System.out.println("ID : "+this.id);
		System.out.println("Bsal : "+this.bsal);
		System.out.println("Tsal : "+Employee.calSal(this.bsal));
	}
	static float calSal(float bsal)
	{
		return bsal + 0.18f*bsal +0.07f*bsal;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Name: ");
		String tname = sc.nextLine();
		System.out.println("ENter id: ");
		String tid = sc.nextLine();
		System.out.println("Enter Bsal : ");
		float tbsal = Float.parseFloat(sc.nextLine());
		Employee e1 = new Employee(tname, tid, tbsal);
		e1.getDetails();
		sc.close();
	}
}
