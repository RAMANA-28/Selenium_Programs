package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CarCheckBox {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		//driver.navigate().to("https://forms-uat.toyotabeta.co.uk/brochure");
		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Click on agree button
		driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
		//click on car image
		driver.findElement(By.xpath("//*[@id=\"car_models\"]/div/ul/li[1]/div/img")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.name("brochure_aygo")).getText());
		
	}

}
