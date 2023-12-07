package p1;

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
		Employee e1 = new Employee("Tharun","A1",25000f);
		Employee e2 = new Employee("Sajid","A2",25000f);
		Employee e3 = new Employee("Kartik","A3",25000f);
		Employee e4 = new Employee("Moksh", "A4",25000f);
		
		e3.getDetails();
		e2.getDetails();
		
	}
}
