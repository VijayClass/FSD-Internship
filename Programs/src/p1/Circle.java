package p1;

public class Circle {
	float radius;
	//A
	Circle()
	{
		this.radius = 6.3f;
	}
	//A
	Circle(float rad)
	{
		this.radius = rad;
	}
	//B
	public String toString()
	{
		return String.valueOf(this.radius);
	}
	
	//c
	public boolean equals(Object ob)
	{
		Circle c1 = (Circle)ob;
		return Float.compare(c1.radius, this.radius)==0;
	}
	//D
	public float areaOfCircle()
	{
		return (float)(Math.pow(this.radius,2)*Math.PI);
	}
	//E
	public float areaOfCircle(Circle c1)
	{
		return (float)(Math.pow(c1.radius,2)*Math.PI);
	}
	public static void main(String[] args) {
		System.out.println(new Circle().areaOfCircle(new Circle(85)));
	}
}
