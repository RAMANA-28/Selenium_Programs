package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaAlert {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Click on First 'Click me' button
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		//Move corsor pointers to alert page :Get the alert text and Print into Consol
		String fistalert = driver.switchTo().alert().getText();
		System.out.println(fistalert);
		//Click on ok button
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//Click on Second 'Click me' button
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(8000);
		//Move corsor pointers to alert page :Get the alert text and Print into Consol
		String secondalert = driver.switchTo().alert().getText();
		System.out.println(secondalert);
		//Click on ok button
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//Click on Third 'Click me' button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		//Move corsor pointers to alert page :Get the alert text and Print into Consol
		String thirdalert = driver.switchTo().alert().getText();
		System.out.println(thirdalert);
		//Click on Cancel button
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		//After Clcik on Cancel or Ok butoon Get the Green color text on Thrid row element
		String greenclortext = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(greenclortext);
	}

}
