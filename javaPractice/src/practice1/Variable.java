package practice1;

public class Variable {
	static int a=10;//static variable
	int b=20;//instance or global variable
	public void add() {
		int c = 25;//local variable
		System.out.println(c);
	}
public static void main(String[] args) {
	System.out.println(a);
	System.out.println(new Variable().b);
	new Variable().add();
}
}
