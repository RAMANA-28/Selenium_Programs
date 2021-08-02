package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JRI_Create_Account {

	public static void main(String[] args) throws Exception {

    WebDriver driver;
    
    System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	//Type URL Browser
	driver.get("https://www.justrechargeit.com/SignIn.aspx");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	// Anchor tag(hyper link)
//	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.partialLinkText("your")).click();

	}

}
