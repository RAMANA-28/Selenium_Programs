package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XE {

	public static void main(String[] args) throws Exception {
		   WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
			driver =new ChromeDriver();
			driver.navigate().to("https://www.xe.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			//Get the Text from application
			String text = driver.findElement(By.xpath("//*[@id=\'__next']/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div")).getText();
			System.out.println(text);
           //Get the Attribute to get the html code
			String amount = driver.findElement(By.id("amount")).getAttribute("value");
			System.out.println(amount);
	}

}
