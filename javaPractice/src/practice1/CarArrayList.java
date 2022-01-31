package practice1;

import java.util.ArrayList;

public class CarArrayList {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(new Car("tata"));//object into a collection
	al.add(new Car("audi"));
	al.add(new Car("Polo"));
	al.add(new Car("Scorpio"));
	
	System.out.println(al);
}
}
