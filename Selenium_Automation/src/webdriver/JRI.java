package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JRI {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		driver.manage().window().maximize();
		//Login to the justrechargeit application and Recharge
		driver.findElement(By.id("txtMobileNo")).sendKeys("7092663344");
		driver.findElement(By.id("ddlMobileServiceProvider")).sendKeys("AIRTEL");
		driver.findElement(By.id("amount_textfield")).sendKeys("100");
        
		//Java script Executor
		WebElement des= driver.findElement(By.id("imgbtnMobileRecharge"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", des);
	}


}
