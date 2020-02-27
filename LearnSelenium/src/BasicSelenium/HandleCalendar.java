package BasicSelenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");

		String targetDate = "10";
		String targetMonth = "July";
		String targetYear = "2020";

		dr.findElement(By.xpath("//a[@id='nav_automobile'][@name='Navigation Automobile'][text()='Automobile']"))
				.click();

		dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender']")).click();

		String month = dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

		String year = dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		while (!dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equals(targetMonth))
			dr.findElement(By.xpath("//a[@title='Prev']")).click();

		int rows = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size();

		int cols = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td/a")).size();

		System.out.println("Number of rows = "+rows);

		System.out.println("Number of columns = "+cols);

		/*
		 * for(int i=1;i<=rows;i++) {
		 * 
		 * cols =
		 * dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["
		 * +i+"]/td")).size();
		 * 
		 * //for(int j=((7-cols)+1);j<=cols;j++) { for(int j=1;j<=cols;j++) {
		 * 
		 * //System.out.print(" "+dr.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]/a")).
		 * getText()+" "); System.out.print(dr.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]")).
		 * getText());
		 * 
		 * } System.out.println(); }
		 * 
		 * 
		 * 
		 */
		// home work - use iterator and replace for with while as we already have list
		// of webelements

		// and select previous july month

		List<WebElement> list = new ArrayList<>();
		Iterator<WebElement> it = list.iterator();
		for (int r = 1; r <= rows; r++) {

			list = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+r+"]/td"));

			while (it.hasNext()) {
				if(it.next().getText().equals("10")) {
					it.next().click();
					break;
				}
				it.next();
			}
			

		}

	}

}
