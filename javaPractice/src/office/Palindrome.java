package office;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Palindrome {

	
	//using loop
	
	public  static void temppalindrome() {
		String st,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		st=sc.next();
		int l=st.length();
		for(int i=l-1;i>=0;i--) {
			rev=rev+st.charAt(i);
		}System.out.println(rev);
		if(st.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}else
			System.out.println("not palindrome");
	}
	//checking palindrome using stringBuffer class reverse() method:

	public static  void revusingStringBuffer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String a=sc.next();
		StringBuffer a1=new StringBuffer(a);
		String a2 = a1.reverse().toString();
		if(a.equals(a2)) {
			System.out.println("palindrome");
		}else
			System.out.println("not palindrome");
	}

	public static void revusingCollectionsrev() {
		String s="dad";
		List<Character> ls=new ArrayList<>();

		for (char c : s.toCharArray()) {
			ls.add(c);
		}

		Collections.reverse(ls);

		StringBuilder sb=new StringBuilder();
		for (Character c1 : ls) {
			sb.append(c1);
		}
		String s2 = sb.toString();

		System.out.println(s2);
		if(s.equals(s2)) {
			System.out.println("palindrome");
		}else
			System.out.println("not palindrome");

	}

	public static void main(String[] args) {
		//revusingCollectionsrev();
		//temppalindrome();
		revusingStringBuffer();
		
	}

}
