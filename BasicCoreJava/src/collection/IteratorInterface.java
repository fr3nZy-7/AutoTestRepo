package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorInterface {

	public static void main(String[] args) {


		Set<String> set = new HashSet<>(); // output will not be in a sorted manner, list preserves insertion order, HashSet doesnt
		
		set.add("Amey");
		set.add("Gaurav");
		set.add("Anand"); //output will be three unique values, but memory will be taken by all 6 data
		set.add("Amey");
		set.add("Gaurav");
		set.add("Anand");
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("____________________________");
		
		List<String> list = new ArrayList<>();
		
		list.add("Amey");
		list.add("Gaurav");
		list.add("Anand");
		list.add("Amey");
		list.add("Gaurav");
		list.add("Anand");
		
		it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
