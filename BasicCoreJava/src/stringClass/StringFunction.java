package stringClass;

public class StringFunction {

	public static void main(String[] args) {

		String name = "Amey";

		// Function 1 - gives length

		System.out.println(name.length());

		int len = name.length();
		System.out.println(len);

		// Function 2 - gives charater at index

		System.out.println(name.charAt(3));

		// Function 3 - compares string

		String name2 = "amey";

		System.out.println(name.equals(name2)); // is case senstive

		// function 4 - compares string ignores case sensitivty
		System.out.println(name.equalsIgnoreCase(name2)); // ignores case sensitivity

		// Function 5 - splits string on the basis of a char given in split function in
		// this case a space
		// return type of split function is a string array
		String temp = "Amey Tambe";
		String[] arr = temp.split(" ");

		for (String s : arr) {
			System.out.println(s);

		}

		// Function 6 - return sub string , takes index as input
		
		System.out.println(temp.substring(5));
		
		System.out.println(temp.substring(3, 6));// in this case will return characters at index 3,4,5.. not 6
		
		
		// Function 7 - replace string character
		System.out.println(temp.replace(" ", ""));
		
		// Function 8 - trim string, remove space before and after a string 
		String temp2 = " Amey ";
		
		System.out.println(temp2);
		
		System.out.println(temp2.trim());
		
		
		// Function 9 - upper and lower case conversion
		
		String temp3 = "AmEy";
		
		System.out.println(temp3.toLowerCase());
		
		System.out.println(temp3.toUpperCase());
		
		
		
		String name3 = "Anannnnnnd";

		String[] arr2 = name3.split("n");
		int count = 0;

		for (String b : arr2) {
			count++;
		}
		

		System.out.println(count - 1);
		 
		/*int l = name3.length();
		
		int count=0;
		
		for(int i=0;i<l;i++) {
			if(name3.substring(i,i+1) == "n") {
				count++;
			}*/
		}
		
				
		
		

	

}
