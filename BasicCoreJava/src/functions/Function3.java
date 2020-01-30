package functions;

public class Function3 {

	public static void main(String[] args) {

		/*
		 * String[] names = { "Amey", "Gaurav", "Anand", "Neha", "Xyz" };
		 * 
		 * for (String s : names) { System.out.println(getName(s)); }
		 */
		System.out.println(getName("Amey", 28));

	}

	public static String getName(String name) {

		return ("Your name is " + name);
	}

	public static String getName(String name, int age) {

		return ("Your name is " + name + " and your age is " + age);
	}

}
