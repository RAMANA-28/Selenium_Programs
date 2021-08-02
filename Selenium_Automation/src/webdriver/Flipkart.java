package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Click on Close(X) icon
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Move to Groceries
		driver.findElement(By.xpath("//div[text()='Grocery']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// enter pin
		driver.findElement(By.name("pincode")).sendKeys("500001");
		driver.findElement(By.name("pincode")).sendKeys(Keys.RETURN);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement snacksMenu = driver.findElement(By.xpath("//div[contains(text(),'Snacks & Beverages')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", snacksMenu);
		Thread.sleep(500);

		WebElement biscuitsLink = driver.findElement(By.xpath("//a[contains(text(),'Biscuits')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", biscuitsLink);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", biscuitsLink);
		Thread.sleep(6000);
		// click on Add items
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("(//span[contains(text(),'Add Item')])[" + i + "]")).click();
			Thread.sleep(3000);
			}
		// Click on Cart
		driver.findElement(By.xpath("//span[contains(text(),'Cart')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();

			}
	

	}


