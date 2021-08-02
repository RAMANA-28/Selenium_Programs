package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrangAndDropCommands {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions abc = new Actions(driver);
		//Drag and drop Debit side Account(BANK)
		WebElement dragElement = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement dropElement = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		abc.dragAndDrop(dragElement, dropElement).build().perform();
		
	    //Drag and drop Debit side Amount
		WebElement dragAmount = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dropAmount = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		abc.dragAndDrop(dragAmount, dropAmount).build().perform();
		
		//Drag and drop Credit side Account(SALE)
		WebElement dragCreditElement = driver.findElement(By.xpath("//li[@id='credit1']/a"));
		WebElement dropCreditElement = driver.findElement(By.xpath("//ol[@id='loan']/li"));
		abc.dragAndDrop(dragCreditElement, dropCreditElement).build().perform();

		// Drag and drop Credit side Amount
		WebElement dragCreditAmount = driver.findElement(By.xpath("//li[@id='fourth']/a"));
		WebElement dropCreditAmount = driver.findElement(By.xpath("//ol[@id='amt8']/li"));
		abc.dragAndDrop(dragCreditAmount, dropCreditAmount).build().perform();
		
		//Get the 'Perfect!' text
		WebElement text = driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		System.out.println(text.getText());
		
	}

}
