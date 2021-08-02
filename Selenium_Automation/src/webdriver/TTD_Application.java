package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TTD_Application {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Type URL Browser
		driver.get("https://ttdsevaonline.com/#/registration");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Enter firstname,Lastname,Mobilenumber,Address and City
	
        driver.findElement(By.name("fName")).sendKeys("Ramanaiah");
        driver.findElement(By.name("lName")).sendKeys("Challa");
        driver.findElement(By.id("indiMobile")).sendKeys("9999955555");
        driver.findElement(By.name("address1")).sendKeys("Medavakkam");
        driver.findElement(By.name("cityS")).sendKeys("Chennai");
        //Select Country
        Select Country= new Select(driver.findElement(By.name("countryS")));
        Country.selectByVisibleText("India");
        //Select State
        Select State= new Select(driver.findElement(By.name("stateS")));
        State.selectByVisibleText("Tamil Nadu");
        //Zip Code
        driver.findElement(By.name("zipCode")).sendKeys("600100");
        //Select Photo ID Proof
        Select proof= new Select(driver.findElement(By.name("proofS")));
        proof.selectByVisibleText("PAN Card");
        //Photo ID Card Number
        driver.findElement(By.id("proofid")).sendKeys("AJGFPV9876N");
        //Enter Username
        driver.findElement(By.name("emailId")).sendKeys("ram@gmail.com");
        //Create Password
        driver.findElement(By.name("password")).sendKeys("sreerama");
        //confirm Password
        driver.findElement(By.name("repassword")).sendKeys("sreerama");
        
        driver.findElement(By.id("regi_continue")).click();
       
	}

}
