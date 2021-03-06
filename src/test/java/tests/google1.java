package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class google1 {
	
	WebDriver driver = null;

	@BeforeTest
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja Bajaj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority=1)
	
	public void launchgoogle2()
	{
		driver.get("https://google.com");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.name("q")).sendKeys("xyz");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);

	}
	
	@Test (priority=2)
	public void launchgoogle1()
	{
		driver.get("https://linkedin.com");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	@AfterTest
	
	public void aftertest ()
	{
		driver.close();
	}
}
