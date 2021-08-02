package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Just_Recharge_Signinpage {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Type URL Browser
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("jriTop_signin9")).click();
		driver.findElement(By.id("txtUserName")).sendKeys("ramanaiah.challa@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("99999999999");
		driver.findElement(By.id("txtCaptcha")).sendKeys("333");
		Thread.sleep(5000);
		
		//Java script Executor
			WebElement des= driver.findElement(By.id("imgbtnSignin"));
			JavascriptExecutor je = (JavascriptExecutor)driver;
			je.executeScript("arguments[0].click();", des);
			}


	}

