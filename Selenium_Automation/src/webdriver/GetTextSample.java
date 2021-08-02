package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextSample {

	public static void main(String[] args) throws Exception {
		 WebDriver driver;
	     System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");

	     driver =new ChromeDriver();
	     //driver.get("https://www.facebook.com/");
	     
	     //Get the text datafrom Face book
	     //System.out.println(driver.findElement(By.className("_8eso")).getText());

			driver.get("https://collegeweeklive.com/go-signup/");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			//Click on Submit button
			
			driver.findElement(By.id("submit")).click();
			System.out.println(driver.findElement(By.id("firstNameError")).getText());
			System.out.println(driver.findElement(By.id("lastNameError")).getText());
			System.out.println(driver.findElement(By.id("emailAddressError")).getText());
			System.out.println(driver.findElement(By.id("phoneNumberError")).getText());
			System.out.println(driver.findElement(By.id("passwordError")).getText());
			System.out.println(driver.findElement(By.id("ConfirmPasswordError")).getText());
			System.out.println(driver.findElement(By.id("nationalityError")).getText());
			System.out.println(driver.findElement(By.id("attendeeTypeError")).getText());
			System.out.println(driver.findElement(By.id("questions_137Error")).getText());

	}

}
