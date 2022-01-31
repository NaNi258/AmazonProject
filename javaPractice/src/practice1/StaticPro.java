package practice1;

public class StaticPro {
	int rollno;
	String name;
	static String college="iit";
	static int count=0;
	
	public StaticPro() {
	count++;
	System.out.println(count);
	}
	
	
	public StaticPro(int r,String n) {
		rollno=r;
		name =n;
	}

	void display() {
		System.out.println("rollnumber : "+rollno+" name : "+name+" college : "+college);
	}
	public static void main(String[] args) {
		StaticPro s1=new StaticPro(1, "Nalini");
		s1.display();
		StaticPro s2=new  StaticPro(2, "Nithish");
		s2.display();
//checking the memory management of the static variable
		StaticPro s3=new StaticPro();
		StaticPro s4=new StaticPro();
		StaticPro s5=new StaticPro();
	}

}
