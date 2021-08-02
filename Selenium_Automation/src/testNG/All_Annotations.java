package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class All_Annotations {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	    driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
	    
  }
  @BeforeMethod
  public void beforeMethod() {
	  Select MN= new Select(driver.findElement(By.id("questions_16_Month")));
	  MN.selectByVisibleText("July");
	  Select Day= new Select(driver.findElement(By.id("questions_16_DayOfMonth")));
	  Day.selectByVisibleText("11");
	  Select Year= new Select(driver.findElement(By.id("questions_16_DOBYear")));
	  Year.selectByVisibleText("1986");
  }
  @AfterMethod
  public void afterMethod() {
	driver.findElement(By.id("questions[q_19]")).click();
	driver.findElement(By.id("questions[q_19][0]")).click();
	driver.findElement(By.id("questions[q_19]")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  Select am= new Select(driver.findElement(By.name("attendeeType")));
      am.selectByVisibleText("Student Looking for Graduate Degree");
  }
  @AfterClass
  public void afterClass() {
	  Select AS= new Select(driver.findElement(By.id("questions[q_134]")));
	  AS.selectByVisibleText("Fall 2021");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	driver.findElement(By.id("firstName")).sendKeys("RAMANAIAH");
    driver.findElement(By.id("lastName")).sendKeys("CHALLA");
	driver.findElement(By.id("emailAddress")).sendKeys("ramanaiah.challa@gmail.com");
	driver.findElement(By.id("phoneNumber")).sendKeys("7092663344");
	driver.findElement(By.id("password")).sendKeys("Sreerama");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Sreerama");
  }
  @AfterTest
  public void afterTest() {
	Select country= new Select(driver.findElement(By.id("country")));
	country.selectByVisibleText("UNITED STATES");
  }
  @BeforeSuite
  public void beforeSuite() {
	 System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 System.out.println("The setup process is completed");
  }
  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
