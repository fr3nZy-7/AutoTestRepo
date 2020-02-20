package BasicSelenium;

public class User {

	public static void main(String[] args) {
		
		ClassB dr = new ClassB();
		
		dr.func2().func1();

	}

}
// ClassA ClassB and User are created for an example
// there are two types of data type
//primitive and non primitive
//primitive are int, float, string etc etc
//non primitive are class objects, arrays etc
//in this case func2 of ClassB return object of ClassA and by doing this we can call func1 of ClassA