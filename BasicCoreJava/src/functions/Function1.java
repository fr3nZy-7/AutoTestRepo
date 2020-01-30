package functions;

public class Function1 {

	public static void main(String[] args) {

		Function1.sum();

		sum(10, 20);

		sum(20, 30);

	}

	public static void sum() {

		int a = 10;
		int b = 20;

		System.out.println(a + b);
	}

	public static void sum(int a, int b) {

		System.out.println(a + b);
	}

}
// this is static polymorphism
// method overloading
// method overloading can be achieved by increasing paramters, decreassing the count of parameters 
// and changing the type of parameters