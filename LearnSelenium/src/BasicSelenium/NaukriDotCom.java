package BasicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriDotCom {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("http://www.naukri.com");

		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String parent = dr.getWindowHandle();
		Set<String> wins = dr.getWindowHandles();

		for (String w : wins) {
			if (!w.equals(parent)) {
				dr.switchTo().window(w);
				dr.close();
			}
		}

		dr.switchTo().window(parent);

		dr.findElement(By.xpath("//span[@id='block'][@class='fr geoLocBtn later'][text()='Later']")).click();

		dr.findElement(By.xpath("//div[@class='mTxt'][text()='Login']")).click();

		dr.findElement(By.xpath("//input[@name='email'][@id='eLoginNew']")).sendKeys("amey_iaf@yahoo.co.in");

		dr.findElement(By.xpath("//input[@name='PASSWORD'][@id='pLogin']")).sendKeys("fr3nZy#4480");

		dr.findElement(By.xpath("//button[@type='submit'][text()='Login']")).click();

	}

}
