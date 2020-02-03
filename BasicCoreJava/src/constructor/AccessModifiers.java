package constructor;

public class AccessModifiers {

	public static void main(String[] args) {
		
	//there are 4 types of access modifiers in java
	//public - can be accessed throughout the project
	//private - can be accessed within the class
	//no access - Can be accessed within the package 
	//protected - Can be accessed within the package, or throughout the project using child class
		
		
		//|	Access Modifiers|	Class	|	Package	|	Project						|
		//|	Public			|	Yes		|	Yes		|	Yes							|
		//|	Private			|	Yes		|	No		|	No							|
		//|	NoAccessMod		|	Yes		|	Yes		|	No							|
		//|	Protected		|	Yes		|	Yes		|	Using child class only		|
		
		
		AccessModifiers obj = new AccessModifiers();
		
		obj.publicFunc();
		
		obj.privateFunc();
		
		obj.noAccessFunc();
		
		obj.protectedFunc();
		
		
	}
	
	
	public void publicFunc() {
		
	}
	
	private void privateFunc() {
		
	}
	
	void noAccessFunc() {
		
	}
	
	protected void protectedFunc() {
		
	}

}
