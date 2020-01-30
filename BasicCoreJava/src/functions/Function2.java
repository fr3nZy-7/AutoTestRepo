package functions;

public class Function2 {

	public static void main(String[] args) {
		
		int add1 = sum(10,20);
		
		int add2 = sum(20,40);
		
		System.out.println(add1);
		System.out.println(add2);

	}

	
	public static void sum() {

		int a = 10;
		int b = 20;

		System.out.println(a + b);
	}

	public static int sum(int a, int b) {

		return(a + b);
	}
}
