package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Get Current URL of the Webpage
		String url=driver.getCurrentUrl();
		System.out.println("HomePage URL is: " +url);
		//System.out.println(driver.getCurrentUrl());
		//Get the title of the current page
		String fbtitle = driver.getTitle();
		System.out.println("FB Page Title is: " + fbtitle);
		
		//Click on forget password link 
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(5000);
		
		//Get Current URL of the Webpage
		String fburl = driver.getCurrentUrl();
		System.out.println("forgotPasswordPage URL is: "  + fburl);
		
		//Get the title of the current page
		String forgotPageTitle = driver.getTitle();
		System.out.println("forgotPasswordPage Title is: " + forgotPageTitle );
		
		//Facebook – log in or sign up
		//Forgotten Password | Can't Log In | Facebook
	
			if (fbtitle.equals(forgotPageTitle)) {
				System.out.println("Application is in FB Login screen only");
			} else {
                 System.out.println("Application is displaying forgotPassword page Successfully");
			}
			
			if (forgotPageTitle.contains("Forgotten")) {
				 System.out.println("*****Application is displaying forgotPassword page Successfully*****");
			} else {
                 System.out.println("Application Not Moved to forgotPassword");
			}
		}
		
	}
	
