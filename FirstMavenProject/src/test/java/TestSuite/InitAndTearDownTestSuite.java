package TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class InitAndTearDownTestSuite {
	
	public static WebDriver dr;
	
	@BeforeSuite
	public void suiteInitialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");
		
		dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		//dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@AfterSuite
	public void suiteTearDown() {

		//dr.close();
	}

}
