package office;

import java.util.Scanner;

public class UniqueIntStraing {
	public void uniqueIntegers() {
		System.out.println("printing unique interger array from given array");
		int[] in= {1,2,3,4,3,2,1};
		System.out.println("the integer array is: ");
		for(int i=0;i<in.length;i++) {
			System.out.print(in[i]+" ");
		}
		System.out.println();
		System.out.println("*********************************");
		int a=0;
		int[] arr=new int[100];
		for(int i=0;i<in.length;i++) {
			int count=0;
			for(int j=i+1;j<in.length;j++) {
				if(in[i]==in[j]) {
					count=1;
					break;
				}
			}if(count==0) {
				arr[a]=in[i];
				a++;
			}
		}
		for(int b=0;b<a;b++) {
			System.out.println(arr[b]);
		}
	}
	
	public void uniqueIntegerUser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("printing unique interger array from given array");
		System.out.println("enter the index values: ");
		int n=sc.nextInt();
		int[] in=new int[n];
		System.out.println("enter the integers: ");
		for(int i=0;i<in.length;i++) {
			in[i]=sc.nextInt();
		}
		System.out.println("the integer array is: ");
		for(int i=0;i<in.length;i++) {
			System.out.print(in[i]+" ");
		}
		System.out.println();
		System.out.println("*********************************");
		int a=0;
		int[] arr=new int[100];
		for(int i=0;i<in.length;i++) {
			int count=0;
			for(int j=i+1;j<in.length;j++) {
				if(in[i]==in[j]) {
					count=1;
					break;
				}
			}if(count==0) {
				arr[a]=in[i];
				a++;
			}
		}
		System.out.println("the unique array list is: ");
		for(int b=0;b<a;b++) {
			System.out.println(arr[b]);
		}
	}
	
	public void uniqueString() {

		System.out.println("printing unique String array from given array");
		String[] st= {"abc","def","ghi","abc"};
		System.out.println("the char array is: ");
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+" ");
		}System.out.println();
		System.out.println("*********************************");
		int a=0;
		String[] arr=new String[100];
		for(int i=0;i<st.length;i++) {
			int count=0;
			for(int j=i+1;j<st.length;j++) {
				if(st[i].equals(st[j])) {
					count=1;
					break;
				}
			}if(count==0) {
				arr[a]=st[i];
				a++;
			}
		}
		for(int b=0;b<a;b++) {
			System.out.println(arr[b]);
		}
	}
	
	public void uniqueSringuser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("printing unique String array from given array");
		
		System.out.println("enter the index values: ");
		int n=sc.nextInt();
		String[] st=new String[n];
		
		System.out.println("enter the string values:");
		for(int i=0;i<st.length;i++) {
			st[i]=sc.next();
		}
		System.out.println("the String array is: ");
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+" ");
		}System.out.println();
		System.out.println("*********************************");
		int a=0;
		String[] arr=new String[100];
		for(int i=0;i<st.length;i++) {
			int count=0;
			for(int j=i+1;j<st.length;j++) {
				if(st[i].equals(st[j])) {
					count=1;
					break;
				}
			}if(count==0) {
				arr[a]=st[i];
				a++;
			}
		}
		for(int b=0;b<a;b++) {
			System.out.println(arr[b]);
		}
	}
	public static void main(String[] args) {
		UniqueIntStraing i=new UniqueIntStraing();
		//i.uniqueIntegers();
		//i.uniqueIntegerUser();
		i.uniqueString();
		//i.uniqueSringuser();
	}
}

