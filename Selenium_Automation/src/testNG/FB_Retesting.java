package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FB_Retesting  {
	WebDriver driver;
	
	@Test(dataProvider = "RAMANA")
  public void f(String username, String password) throws Exception {
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.name("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();
	Thread.sleep(5000);
  }

  @DataProvider
  public Object[][] RAMANA() {
    return new Object[][] {
      new Object[] { "ramanaiah@gmail.com", "a1234567." },
      new Object[] { "sreerama@gmail.com", "b1234567." },
      new Object[] { "sreekrishna@gmail.com", "c1234567." },
      new Object[] { "prasanna@gmail.com", "d1234567." },
      new Object[] { "ramakrishna@gmail.com", "e1234567." },
    };
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
