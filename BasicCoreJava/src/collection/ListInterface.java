package collection;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterface {

	public static void main(String[] args) {
		/*
		 * Object[] arr = new Object[3];
		 * 
		 * arr[0] = "Amey"; 
		 * arr[1] = true; 
		 * arr[2] = 29;
		 */
//object is super class of all the classes in java
// to overcome the problem of array storing homogenous values (int array will store only int)
//we can make an object of Object class to store values of different data types
		
		List<String> list = new ArrayList<>();
		
		list.add("Amey");
		list.add("Gaurav");
		list.add("Anand");
		
		for(String s:list) {		//enhanced for loop is used for String array and collections
			System.out.println(s);
		}
		
		
		list = new LinkedList<>();
		
		list.add("Amey");
		list.add("Gaurav");
		list.add("Anand");
		
		for(String s:list) {		//enhanced for loop is used for String array and collections
			System.out.println(s);
		}
		
		
		list = new Vector<>();
		
		list.add("Amey");
		list.add("Gaurav");
		list.add("Anand");
		
		for(String s:list) {		//enhanced for loop is used for String array and collections
			System.out.println(s);
		}
	}
}