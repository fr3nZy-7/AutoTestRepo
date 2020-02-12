package practicePackage;

public class Fibonacci {

	public static void main(String[] args) {
		int limit = 20;
		int first = 0, second = 1;
		int next;
		
		System.out.println("Printing first "+limit+" Fibonacci numbers in the series");
		System.out.println(first);
		System.out.println(second);
		for(int i=0;i<limit;i++) {
			next = first + second;
			System.out.println(next);
			first = second;
			second = next;
			
		}
		

	}

}
