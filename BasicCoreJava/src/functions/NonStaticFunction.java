package functions;

public class NonStaticFunction {

	public static void main(String[] args) {

		NonStaticFunction ref = new NonStaticFunction();
		
		int s= ref.sum(10, 20);
		
		System.out.println(s);
		
		
		//static fucntions can only call static function and variable
		//to call a non static function or variable , user has to create an object of the class
		//where the variable/fucntion is defined
		//object is an instance of a class
		

	}
	
	public int sum(int a, int b) {
		return a+b;
	}

}
