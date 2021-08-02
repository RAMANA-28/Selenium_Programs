package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BlazedDemo {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Type URL Browser
		driver.get("https://blazedemo.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Choose your departure city
		Select departureCity = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		departureCity.selectByVisibleText("Portland");
		//Choose your destination city
		Select destinationCity = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		destinationCity.selectByVisibleText("London");
		//click on find Flights button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//click on choose this flight
		driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[3]")).click();
		Thread.sleep(5000);
		//Your flight from TLV to SFO has been reserved
		driver.findElement(By.id("inputName")).sendKeys("RAMANA");
		driver.findElement(By.id("address")).sendKeys("Medavakam");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		driver.findElement(By.id("state")).sendKeys("TamilNadu");
		driver.findElement(By.id("zipCode")).sendKeys("600100");
		//Select Card Type
		Select cardType = new Select(driver.findElement(By.id("cardType")));
		cardType.selectByVisibleText("American Express");
		// Enter creditCardNumber
		driver.findElement(By.id("creditCardNumber")).sendKeys("123456789");
		driver.findElement(By.id("creditCardMonth")).sendKeys("12");
		driver.findElement(By.id("creditCardYear")).sendKeys("2022");
		driver.findElement(By.id("nameOnCard")).sendKeys("Ramanaiah challa");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Get text from success message
		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]"));
		System.out.println(text.getText());
	
  }
}
