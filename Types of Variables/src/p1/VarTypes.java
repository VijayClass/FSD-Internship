package p1;
public class VarTypes {
	static int num1  = 100; //static var
	int num2 = 200;//instance var
	public static void main(String[] args) {
		int num3 = 300;//local Variables
		System.out.println(VarTypes.num1);
		System.out.println(num3);
		VarTypes ob = new VarTypes();
		System.out.println(ob.num2);
		
		VarTypes.num1 += 50;
		ob.num2 += 80;
		
		System.out.println(VarTypes.num1);
		System.out.println(ob.num2);
		
		VarTypes ob2 = new VarTypes();
		System.out.println(ob2.num2);

		System.out.println(ob.num2);
	}
}
