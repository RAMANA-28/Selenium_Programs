package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

		public static void main(String[] args) throws Exception {
			
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			// Type URL Browser
			driver.get("https://www.xe.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);

	        //Get the attribute value from HTML code (Developer code)
		
			String amount=driver.findElement(By.name("amount")).getAttribute("class");
			System.out.println(amount);
			
			//Get Text
			 
			String cd=driver.findElement(By.className("heading__Heading1-n07sti-0 heading__Heading2-n07sti-1 iXbZUl")).getText();
			System.out.println(cd);
	}

}
