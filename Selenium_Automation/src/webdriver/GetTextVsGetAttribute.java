package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttribute {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// Type URL Browser
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		// Get the gmail link text
		String gmailtext = driver.findElement(By.className("gb_f")).getText();
		System.out.println(gmailtext);
		
        //Get the attribute value from HTML code (Developer code)
		String abc=driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println(abc);
		String bcd=driver.findElement(By.name("btnK")).getAttribute("data-ved");
		System.out.println(bcd);
		
	
	}

}
