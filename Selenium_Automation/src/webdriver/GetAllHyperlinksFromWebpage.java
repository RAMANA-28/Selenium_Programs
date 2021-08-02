package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import corejava.ForLoopSample;

public class GetAllHyperlinksFromWebpage {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// Type URL Browser
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Get All Hyperlinks
	    List<WebElement> allhyperlinks = driver.findElements(By.tagName("a"));
	    
	    //Get the Size of the list
	    System.out.println(allhyperlinks.size());
	    
	  //Print all the Hyperlinks(using foreach loop)
      
	    for (WebElement webElement : allhyperlinks) {
			System.out.println(webElement.getText());
		}
	}
}
