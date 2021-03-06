package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class google {
	
	WebDriver driver = null;

	@BeforeTest
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja Bajaj\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	
	public void launchgoogle()
	{
		System.out.println("entered");
		driver.get("https://flipkart.com");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();	
	
		
//		driver.findElement(By.name("q")).sendKeys("xyz");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
//		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);


	}
	
	@AfterTest
	
	public void aftertest ()
	{
	//	driver.close();
	}
}
