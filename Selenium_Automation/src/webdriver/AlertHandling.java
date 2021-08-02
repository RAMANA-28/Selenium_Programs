package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Click on CONTINUE TO LOGIN hyperlink
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(5000);
		//Click on Login button
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(5000);
		
		//Move corsor pointers to alert page :
		//Get the alert text and Print into Consol
		 String alerttext = driver.switchTo().alert().getText();
		 System.out.println(alerttext);
		 
		//Click on OK button in alert(Use accept())
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        
        //Click on New User link
		driver.findElement(By.partialLinkText("New User")).click();
		Thread.sleep(5000);
		String confirmationalerttext = driver.switchTo().alert().getText();
		System.out.println(confirmationalerttext);
        
        //Confirmation Alert: It Contains two options OK or CANCEL
        //Click on OK button in confirmationalert(Use accept())
        driver.switchTo().alert().accept();
        // Click on CANCEL button in confirmationalert(Use dismiss())
        driver.switchTo().alert().dismiss();
	}

}
