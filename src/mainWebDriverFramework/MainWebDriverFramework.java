package mainWebDriverFramework;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainWebDriverFramework {


//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
//		WebDriver driver = new FirefoxDriver();
	
		static WebDriver driver;
		
	
	@BeforeClass 
		public void AOpeningBrowser()
		{
		
		driver = new FirefoxDriver();
		driver.get("https://app.jazz.co/home/signin");
		driver.manage().window().maximize();
		}
		
	@Test(dependsOnMethods=("AOpeningBrowser"),alwaysRun=true)   /*dependency Annotation*/
		public void LoggingIn()
		{	
		driver.findElement(By.id("user")).sendKeys("farooq.iqbal@nts.com");
		driver.findElement(By.id("pass")).sendKeys("Password123");
		driver.findElement(By.id("sign_in_button")).click();
		}
		
	@AfterClass
	public void teardown() {
		
		driver.close();
	}
	
	}
