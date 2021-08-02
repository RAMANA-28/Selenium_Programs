package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

		public static void main(String[] args) throws Exception {
			
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
			driver =new ChromeDriver();
			driver.navigate().to("https://www.platformqedu.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			//Crete Action Reference Name
			//Move cursor point to the About element Menu
			Actions abc = new Actions(driver);
			WebElement aboutElementMenu = driver.findElement(By.xpath("//a[@title='About']"));
			abc.moveToElement(aboutElementMenu).build().perform();
			//Click on Compare link
			WebElement compareLink = driver.findElement(By.xpath("//a[@title='Compare']"));
			abc.click(compareLink).build().perform();
		

	}

}
