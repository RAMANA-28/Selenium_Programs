package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FacebookLogin {
	WebDriver driver;

  @Test
  public void f() {
	// Type the website URL
	driver.get("https://www.facebook.com/");
	// Type the UN & PWD
	driver.findElement(By.id("email")).sendKeys("ramanaiah.challa@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("ramanaiah");
	driver.findElement(By.name("login")).click();
  }
  @BeforeClass
  public void beforeClass() {
	 System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
	 driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
