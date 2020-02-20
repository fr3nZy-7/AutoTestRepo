package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FisrtSeleniumClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/");
		//http://sampleapp.tricentis.com/
		
		
	}
	
	public FisrtSeleniumClass() {
		
		System.out.println("Testing constructor");
		
	}

}

/*
 * webElements
 
1. links
2. input box
3. radio button
4. checkbox
5. drop down combobox
6. scroll
7. button
8. table
9. text
10. windows
11. iframe
12. ajax
13. alerts
14. image
15. file
16. tool tip
17. progressbar
18. refresh
19. tree / expand and collapse
20. mega menu



*/