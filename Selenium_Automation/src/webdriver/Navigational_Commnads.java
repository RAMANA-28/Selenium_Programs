package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_Commnads {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Click on forget password link 
		driver.findElement(By.linkText("Forgotten password?")).click();
	    //Enter Mobile Number
		driver.findElement(By.id("identify_email")).sendKeys("ramana.challa");
		Thread.sleep(5000);
		//Click on Relaod icon(Page Refersh)
		driver.navigate().refresh();
		Thread.sleep(5000);
		//Go back to FB Login Screen(Use Back arrow icon)
		driver.navigate().back();
		Thread.sleep(5000);
		//click on Forword icon
		driver.navigate().forward();
		Thread.sleep(5000);
		
		
	}

}
