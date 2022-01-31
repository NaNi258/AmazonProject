package practice1;

public class Staticmethod {
	static  int i;
	static int j;
	int a=03;
	
	public static void example() {
	System.out.println(	new Staticmethod().a);
		System.out.println("i=  "+i+"  j=  "+j);
	}

	public static void main(String[] args) {
		example();
		i=25;
		j=14;
		example();
	}
}
