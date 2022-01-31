package practice1;

public class ConstructorPara {
String name;
String color;
public ConstructorPara(String n,String c) {
	this.color=c;
	this.name=n;
	}
public void details() {
	System.out.println("name: "+name);
	System.out.println("color: "+color);
}
}
