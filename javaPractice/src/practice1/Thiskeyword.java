package practice1;

public class Thiskeyword {
	int a=14;
	
	public void test() {
		int a=25;
		System.out.println(a);//25
		System.out.println(this.a);//14
	}
public static void main(String[] args) {
	Thiskeyword t=new Thiskeyword();
	t.test();
}
}

/*
 * To use global non static inside a non static method we have to use
 * with the reference of this keyword
 */
