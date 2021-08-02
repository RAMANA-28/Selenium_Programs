package webdriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotsSample {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("https://www.fb.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Get the current date and time from your system
		Date d= new Date();
		System.out.println(d);
		
		// Convert system date format as per your own format
		DateFormat df = new SimpleDateFormat("yyyyMMMddHHmmss");
		String timestmap = df.format(d);
		System.out.println(timestmap);
		
		// Take Screen shots
		// System will take a snap of current screen and store into temp to RAM location
		File fi = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Move your file to Specific floder(screen shots)
		FileHandler.copy(fi, new File("./Screenshots/fb"+timestmap+".png"));
	}

}
