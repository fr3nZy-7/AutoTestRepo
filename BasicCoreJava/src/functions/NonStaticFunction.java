package functions;

public class NonStaticFunction {

	public static void main(String[] args) {

		NonStaticFunction ref = new NonStaticFunction();
		
		//int s= ref.sum(10, 20);
		
		int s=NonStaticFunction.sum(5, 6);
		
		System.out.println(s);
		
		
		//static fucntions can only call static function and variable
		//to call a non static function or variable , user has to create an object of the class
		//where the variable/fucntion is defined
		//object is an instance of a class
		//static variable, fucntion is one copy per class. 
		//non static variable and methods are stored for each object instance
		//therefore to call non static variables, methods we need object of the class.
		//to call static variables / methods we do not need object of a class
		

	}
	
	public static int sum(int a, int b) {
		return a+b;
	}

}
