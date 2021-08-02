package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebdriverLocators {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
	    
	    System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	
			//Type URL Browser
			driver.get("https://www.justrechargeit.com/SignIn.aspx");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Forgot your password?")).click();
			//driver.findElement(By.partialLinkText("your")).click();
			Thread.sleep(5000);
		//Navigate from current page to Next URL
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//click on RoundTrip Radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        //Click on Sr.Citizen check box
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		//Select USA Option from Currency dropdown
		Select currency= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByVisibleText("USD");

	}

}
