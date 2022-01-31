package office;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UniqueArrayListSet {
	//arraylist
	public void uniqueArraylistusingloop() {
		System.out.println("printing unique arraylist using loop");
		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(2);
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
				al.remove(i);
				}
			}
		}System.out.println(al);
	}
	
	public void uniquestringAL() {
		System.out.println("printing unique String in arraylist using loop");
		ArrayList<String> al=new ArrayList<>();
		al.add("abc");
		al.add("efg");
		al.add("hij");
		al.add("abc");
		for (String s : al) {
			System.out.println(s);
		}
		
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
				al.remove(i);
				}
			}
		}System.out.println(al);
	}
	
	public void uniqueCharAL() {
		System.out.println("printing unique arraylist using loop");
		ArrayList<Character> al=new ArrayList<>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('a');
		for (Character c : al) {
			System.out.println(c);
		}
		
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
				al.remove(i);
				}
			}
		}System.out.println(al);
	}
	
	
	public void uniqueArraylistusingStreams() {

		System.out.println("printing unique arraylist using stream concept");
		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(2);
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
		List<Integer> unique=al.stream().distinct().collect(Collectors.toList());
		System.out.println("unique values: ");
		
		for(int i=0;i<unique.size();i++) {
			System.out.println(unique.get(i));
		}
	}
	
	public void uniqueArrayListusingSet() {
		System.out.println("printing unique arraylist using hashset");
		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(2);
		for (Integer integer : al) {
			System.out.println(integer);
		}
		Set<Integer> s=new HashSet<>(al);
		System.out.println("unique values:");
		System.out.println(s);
	}
	
	
	
	
	//set
	public void uniqueHashset() {

		System.out.println("printing unique Hashset");
		Set<Integer> s=new HashSet<>();
		s.add(14);
		s.add(3);
		s.add(3);
		s.add(8);
		s.add(25);
		System.out.println(s);
		
	}
	public void uniqueLinkedHashSet() {

		System.out.println("printing unique LinkedHashset");
		Set<Integer> s=new LinkedHashSet<>();
		s.add(14);
		s.add(3);
		s.add(3);
		s.add(8);
		s.add(25);
		System.out.println(s);
	}
	public void uniqueTreeSet() {

		System.out.println("printing unique TreeSet");
		Set<Integer> s=new TreeSet<>();
		s.add(14);
		s.add(3);
		s.add(3);
		s.add(8);
		s.add(25);
		System.out.println(s);
	}
public static void main(String[] args) {
	UniqueArrayListSet as=new UniqueArrayListSet();
	//as.uniqueArraylistusingloop();
	//as.uniquestringAL();
	//as.uniqueCharAL();
	//as.uniqueArraylistusingStreams();
	//as.uniqueArrayListusingSet();
	
	as.uniqueHashset();
	//as.uniqueLinkedHashSet();
	//as.uniqueTreeSet();
	
}
}
