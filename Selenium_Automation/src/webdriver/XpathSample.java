package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSample {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Click on Female Gender icon
		driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();
	}

}
