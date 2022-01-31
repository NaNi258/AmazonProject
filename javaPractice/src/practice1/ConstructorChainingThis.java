package practice1;

public class ConstructorChainingThis {
	String name;
	int id;
	static String college;

	public ConstructorChainingThis() {
	}
	public ConstructorChainingThis(String n) {
		this();
		this.name=n;
	}
	public ConstructorChainingThis(String n,int i) {
		this(n);
		this.id=i;
	}
	public void display() {
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("college: " +college);
	}
	public static void main(String[] args) {
		ConstructorChainingThis ct=new ConstructorChainingThis("nani",25);
		ct.display();

		ConstructorChainingThis ct1=new ConstructorChainingThis();
		ct1.display();

	}
}
