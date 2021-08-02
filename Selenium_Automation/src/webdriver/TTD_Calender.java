package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TTD_Calender {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Type URL Browser
		driver.get("https://ttdsevaonline.com/#/registration");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//click on Calender
		driver.findElement(By.id("regdob")).click();
		Thread.sleep(5000);
		//Select Month in dropdown
		WebElement Month = driver.findElement(By.xpath("//select[@title='Change the month']"));
		Select dobMonth = new Select(Month);
		dobMonth.selectByVisibleText("December");
		Thread.sleep(5000);
		//Select Year in dropdown
		WebElement Year = driver.findElement(By.xpath("//select[@title='Change the year']"));
		Select dobYear = new Select(Year);
		dobYear.selectByVisibleText("1985");
		Thread.sleep(5000);
		//Select date
		driver.findElement(By.linkText("28")).click();
		
	
	}

}
