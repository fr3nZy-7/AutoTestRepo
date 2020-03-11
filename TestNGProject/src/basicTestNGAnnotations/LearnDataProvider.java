package basicTestNGAnnotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnDataProvider {
	
	@BeforeClass
	@Parameters({"browser"})
	public void initialize(String browser) {
		
		System.out.println("Open "+browser+" browser");
		
	}
	
	@Test(dataProvider = "getData")
	//dataProvider is a built in function, syntax is dataProvider = function name
	// and the function should have the data provider annotation
	//can be used to run same test using different data sets
	// will run 4 iteration of same test using different set of data 
	public void tes1(String username1, String password1) {
		
		System.out.println("Enter "+ username1+" in username field");
		
		System.out.println("Enter "+ password1+" in password field");
		
	}
	
	@Test
	
//(enabled=false) // this is a @Test parameter, will exclude this function while executing from all , regardless the xml file 
	public void test2() {
		System.out.println("test case 2");
	}
	
	@DataProvider
	
	public String[][] getData(){
		
		String[][] data = new String[4][2];
		
		//row1
		data[0][0] = "Username1";
		data[0][1] = "Password1";
		
		//row2
		data[1][0] = "Username2";
		data[1][1] = "Password2";
		
		//row3
		data[2][0] = "Username3";
		data[2][1] = "Password3";
		
		//row4
		data[3][0] = "Username4";
		data[3][1] = "Password4";
		
		return data;
	}


}
