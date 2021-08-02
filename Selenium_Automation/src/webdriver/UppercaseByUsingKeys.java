package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UppercaseByUsingKeys {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Actions abc = new Actions(driver);
		

		
      //Send the data to Google Search box with uppercases
		WebElement element = driver.findElement(By.name("q"));
//		abc.keyDown(element, Keys.SHIFT).build().perform();
//		abc.sendKeys("hi all how are you?").build().perform();
//		abc.keyUp(Keys.SHIFT).build().perform();
		abc.keyDown(element, Keys.SHIFT).sendKeys("hi all how are you?").keyUp(Keys.SHIFT).build().perform();
	}

}
