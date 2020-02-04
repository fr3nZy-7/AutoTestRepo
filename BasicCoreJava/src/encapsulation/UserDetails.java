package encapsulation;

public class UserDetails {
	
	private int age;
	//private String name;
	
	
	//right click on a variable -> select source -> Generate Getters and setters
	//tick the variable and click generate

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0)
			this.age = age;
	}
	

}
