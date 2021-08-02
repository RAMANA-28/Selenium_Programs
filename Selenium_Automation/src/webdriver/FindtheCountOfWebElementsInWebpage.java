package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindtheCountOfWebElementsInWebpage {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Get the count of Radio Button(s)
		List<WebElement> radiobuttonCount =driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println("RadioButtons Count is : " + radiobuttonCount.size());
		
		//Get the count of EditBox(s)
		List<WebElement> editboxCount =driver.findElements(By.xpath("//*[@type='text']"));
		System.out.println("Editbox Count is : " + editboxCount.size());
		
		//Get the count of Dropdown(s)
		List<WebElement> dropdownCount = driver.findElements(By.xpath("//select"));
		System.out.println("Dropdown Count is : " + dropdownCount.size());
		
		//Get the count of Checkbox(s)
		List<WebElement> checkboxCount = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("Checkbox Count is : " + checkboxCount.size());
		
		//Get Button in Webpage
		List<WebElement> buttonCount = driver.findElements(By.xpath("//button"));
		System.out.println("buttonCount  is : " + buttonCount.size());
		}

}
