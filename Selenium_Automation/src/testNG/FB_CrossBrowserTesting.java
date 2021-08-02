package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FB_CrossBrowserTesting {
	
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
	
	  @Parameters("browserName")
		@BeforeClass
		public void beforeClass(@Optional("Edge") String browserName) {

			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", ".\\browserdrivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", ".\\browserdrivers\\msedgedriver.exe");
				driver = new EdgeDriver();
			} else {
				System.out.println("Please give valid browserName");
			}

		}

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

	}


