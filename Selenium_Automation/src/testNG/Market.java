package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Market {
	
	WebDriver driver;

	  @Test
	  public void f() {
		// Type the website URL
		driver.get("http://mis.nyiso.com/public/");
		// Type the UN & PWD
		driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td/a")).click();
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

