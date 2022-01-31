package office;

import java.util.Scanner;

public class UniqueChar1 {

	public void uniqueChar1() {
		System.out.println("printing unique character in an character array: ");
		char[] ch= {'n','a','l','i','n','i','y','y'};
		System.out.println("the char array is: ");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}System.out.println();
		System.out.println("*********************************");

		char[] arr=new char[100];
		int a = 0;
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count=1;
					break;
				}
			}if(count==0) {
				arr[a]=ch[i];
				a++;
			}
		}
		for(int b=0;b<a;b++) {
			System.out.println(arr[b]);
		}

	}

	public void uniqueChar() {
		Scanner sc=new Scanner(System.in);

		System.out.println("printing unique character in an character array: ");
		System.out.println("enter the characters: ");
		char[] ch=sc.next().toCharArray();
		System.out.println("the char array is: ");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}System.out.println();
		System.out.println("*********************************");

		char[] arr=new char[100];
		int a = 0;
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count=1;
					break;
				}
			}if(count==0) {
				arr[a]=ch[i];
				a++;
			}
		}
		for(int b=0;b<a;b++) {
			System.out.println(arr[b]);
		}

	}


	public static void main(String[] args) {
		UniqueChar1 u=new UniqueChar1();
		u.uniqueChar1();
		//u.uniqueChar(); 
	}
}
