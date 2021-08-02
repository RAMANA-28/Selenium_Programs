package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Collegeweeklive {

	public static void main(String[] args) throws Exception {
		 WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//Type URL Browser
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
	    
		//filling all Manditory fileds
		driver.findElement(By.id("firstName")).sendKeys("RAMANAIAH");
		driver.findElement(By.id("lastName")).sendKeys("CHALLA");
		driver.findElement(By.id("emailAddress")).sendKeys("ramanaiah.challa@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("7092663344");
		driver.findElement(By.id("password")).sendKeys("Sreerama");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sreerama");
		//select Country of Citizenship  as "UNITED STATES"
		Select country= new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("UNITED STATES");
		
		//select I am a  as "Student Looking for Graduate Degree"
		Select am= new Select(driver.findElement(By.name("attendeeType")));
        am.selectByVisibleText("Student Looking for Graduate Degree");
		//Anticipated Start Term
		Select AS= new Select(driver.findElement(By.id("questions[q_134]")));
		AS.selectByVisibleText("Fall 2021");
		//Select Month
		Select MN= new Select(driver.findElement(By.id("questions_16_Month")));
		MN.selectByVisibleText("July");
		//Select Day
		Select Day= new Select(driver.findElement(By.id("questions_16_DayOfMonth")));
		Day.selectByVisibleText("11");
		//Select Year
		Select Year= new Select(driver.findElement(By.id("questions_16_DOBYear")));
		Year.selectByVisibleText("1986");
	    //Majors of Interest
		driver.findElement(By.id("questions[q_19]")).click();
		driver.findElement(By.id("questions[q_19][0]")).click();
		driver.findElement(By.id("questions[q_19]")).click();
		//Select Tearms and Condition
		

	}

}
