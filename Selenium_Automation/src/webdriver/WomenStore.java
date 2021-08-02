package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WomenStore {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	    //click on image 
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
		Thread.sleep(5000);
		// click on Add cart
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		Thread.sleep(5000);
		//Get Text form Success data
		WebElement text = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]"));
		System.out.println(text.getText());
	}
	
}
