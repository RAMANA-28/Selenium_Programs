package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCommands {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://www.platformqedu.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Move cursor point to the Product Menu
		//Crete Action Reference Name
		Actions abc = new Actions(driver);
		WebElement prodcutMenu = driver.findElement(By.xpath("//div[text()='Products']"));
		abc.moveToElement(prodcutMenu).build().perform();
		
		//Move to different URL
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(5000);
		//Source Area
		WebElement fromElement = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		//Target Area
		WebElement toElement = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		//Use Drag and Drop Method
		abc.dragAndDrop(fromElement, toElement).build().perform();
		
		//Move to different URL
		driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
		
		// Do Double click on element
		WebElement eleDoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		abc.doubleClick(eleDoubleClick).build().perform();
				
		//Switchto  cursor point to Alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//Do right click on webelement
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		abc.contextClick(ele).build().perform();
		
		//Send the data to Google Search Box
	}

}
