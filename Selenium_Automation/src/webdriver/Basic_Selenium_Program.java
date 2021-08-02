package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_Selenium_Program {
	public static void main(String[] args) {
		// Pre-condition: Create Webdriver Object/reference
				WebDriver driver;
				// Open the chrome Browser
				System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
				driver = new ChromeDriver();
//				// Open the firfox Browser
//				System.setProperty("webdriver.gecko.driver", ".\\browserdrivers\\geckodriver.exe");
//				driver = new FirefoxDriver();
//				// Open the edge Browser
//				System.setProperty("webdriver.edge.driver", ".\\browserdrivers\\msedgedriver.exe");
//				driver = new EdgeDriver();
				//Login to the justrechargeit application and Signin
				driver.get("https://www.justrechargeit.com/");
				driver.manage().window().maximize();
				driver.findElement(By.id("jriTop_signin9")).click();
				driver.findElement(By.id("txtUserName")).sendKeys("ramanaiah.challa@gmail.com");
				driver.findElement(By.id("txtPasswd")).sendKeys("99999999999");
				driver.findElement(By.id("txtCaptcha")).sendKeys("333");
				driver.findElement(By.id("imgbtnSignin")).click();
				
				//Login to the justrechargeit application and Recharge
				driver.findElement(By.id("txtMobileNo")).sendKeys("7092663344");
				driver.findElement(By.id("ddlMobileServiceProvider")).sendKeys("AIRTEL");
				driver.findElement(By.id("amount_textfield")).sendKeys("100");
				driver.findElement(By.id("imgbtnMobileRecharge")).click();
			}

		}
	


