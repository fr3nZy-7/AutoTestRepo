package collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {

		//map is used to store data when we need it in a key and value format
		//e.g
		//Name = "Amey" where name is the key and Amey is the value
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Amey");
		map.put(2, "Gaurav");
		map.put(3, "Anand"); //key is an interger here as we declared Map<Integer,String>, if we want key to be a string then we have to add String instead of Integer
		
		System.out.println(map.get(2));

	}

}
