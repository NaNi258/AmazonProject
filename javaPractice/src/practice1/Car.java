package practice1;

public class Car {
String name;
 Car() {
	
}
 Car(String n){
	 this.name=n;
 }
 
 //over ride toString()
 
 public String toString() {
	return "name: " +name;
	 
 }
}
