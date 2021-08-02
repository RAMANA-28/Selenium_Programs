package testNG;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToyotaAssinment {
	WebDriver driver;

	  @Test
	  public void f() throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://forms.toyota.co.uk/brochure");
	driver.manage().window().maximize();
	//Implicity wait
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	//Click on agree button
	driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	Random r=new Random();
	int randomNumber = r.nextInt(23);
	System.out.println("randomnumber is  : " + randomNumber);
	//click on car image
	driver.findElement(By.xpath("//*[@id='car_models']/div/ul/li["+randomNumber+"]")).click();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	//Get the car model label
	String carModelLabel = driver.findElement(By.xpath("//*[@id='car_models']/div/ul/li["+randomNumber+"]")).getAttribute("data-display");
	System.out.println("carModelLabel is :" + carModelLabel);
	
	//Choose Title & Get the title
	driver.findElement(By.xpath("//*[@data-select='title']")).click();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	//driver.findElement(By.linkText("Doctor")).click();
	int titleRandomNumber = r.nextInt(8);
	System.out.println("titleRandomNumber is :" + titleRandomNumber);
	driver.findElement(By.xpath("//*[@data-select='title']/ul/li["+titleRandomNumber+"]")).click();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	String titlename = driver.findElement(By.xpath("//*[@data-select='title']")).getText();
	System.out.println("titlename is :" + titlename);
	//first name
	String firstname = "RAMANA";
	driver.findElement(By.name("firstname")).sendKeys(firstname);
	//surname(Combination of "Title+FirstName+CarModelName")
	String surname = titlename+firstname+carModelLabel;
	driver.findElement(By.name("surname")).sendKeys(surname);
	//enter Email id
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramana@gmail.com");
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	  }
}
