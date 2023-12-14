package polymorphism;

public class ConstrucOver {
	int n1,n2,n3;

	public ConstrucOver(int n3) {
		this.n3 = n3;
		System.out.println("1 para");
	}

	public ConstrucOver(int n1, int n2, int n3) {
		this(45,74);
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		System.out.println("3 para");
	}

	public ConstrucOver(int n2, int n3) {
		this(74);
		this.n2 = n2;
		this.n3 = n3;
		System.out.println("2 para");
	}
	public static void main(String[] args) {
		new ConstrucOver(5,87,78);
	}
}
