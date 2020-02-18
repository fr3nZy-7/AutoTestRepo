package collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterface {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); // output will not be in a sorted manner, list preserves insertion order, HashSet doesnt
		
		set.add("Amey");
		set.add("Gaurav");
		set.add("Anand"); //output will be three unique values, but memory will be taken by all 6 data
		set.add("Amey");
		set.add("Gaurav");
		set.add("Anand");
		
		for(String s:set) {
			System.out.println(s);
		}
		
		System.out.println("_______________________________");
		
		set = new LinkedHashSet<>(); 
		
		set.add("Amey");
		set.add("Gaurav");
		set.add("Anand");  //output will be 3 unique values in order of insertion
		set.add("Amey");
		set.add("Gaurav");
		set.add("Anand");
		
		for(String s:set) {
			System.out.println(s);
		}
		
		System.out.println("_______________________________");
		
		set = new TreeSet<>(); 
		
		set.add("Amey");
		set.add("Gaurav");
		set.add("Anand"); 
		set.add("Amey");	//output will be 3 unique values in a sorted ascending order manner
		set.add("Gaurav");
		set.add("Anand");
		
		for(String s:set) {
			System.out.println(s);
		}
		
		System.out.println("_______________________________");

	}

}

// major difference between set and list is -
//List allows duplicate data to be added/inserted
//Set does not allow duplicate data to be added/inserted