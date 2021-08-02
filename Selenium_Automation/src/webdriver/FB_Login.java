package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) {
		
     WebDriver driver;
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\SeleniumWorkspace\\Selenium_Automation\\browserdrivers\\chromedriver.exe");

     driver =new ChromeDriver();
     driver.get("https://www.facebook.com/");
	}

}
