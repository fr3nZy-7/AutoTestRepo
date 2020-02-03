package loops;

import functions.AccessModifiers;

public class TestAccessModAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers obj = new AccessModifiers();
		obj.publicFunc();
		
		TestAccessModAtProjectLevel obj1 = new TestAccessModAtProjectLevel();
		
		obj1.protectedFunc();
		
		

	}

}
