package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCombobox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("file:///C:/Users/admin/Downloads/Practice.html");

		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		Select sel = new Select(dr.findElement(By.xpath("//select[@class='input-xlarge']")));
		
		sel.selectByIndex(2);
		
		
		sel.selectByIndex(1);
		Thread.sleep(7000);
		sel.deselectByIndex(2);

	}

}
