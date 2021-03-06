package tests;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Tests extends BaseClass {
	
	@Test
	
	public void newTest()
	
	{
		System.out.println("umang jain");
		
	}
	
	public void testone()
	{
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Test One", "Sample Test1");

        // log(Status, details)
        test1.log(Status.INFO, "Test one started");

        
		driver.get("https://google.com");
        test1.log(Status.PASS, "navigate to https://google.com");

		driver.findElement(By.name("q")).sendKeys("umang");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        test1.log(Status.INFO, "Test one completed");

		System.out.println("cmpleted testone");
	}	
	
	@Test
	public void logintest() throws InterruptedException
	{
		    driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.findElement(By.id("txtUsername")).click();
		    driver.findElement(By.id("txtUsername")).clear();
		    driver.findElement(By.id("txtUsername")).sendKeys("admin");
		    driver.findElement(By.id("txtPassword")).click();
		    driver.findElement(By.id("txtPassword")).clear();
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    
		    for (int second = 0;; second++) {
		    	if (second >= 60) fail("timeout");
		    	try { if (isElementPresent(By.id("btnLogin"))) break; } catch (Exception e) {}
		    	Thread.sleep(1000);
		    }

		    driver.findElement(By.id("btnLogin")).click();
		

		    driver.findElement(By.id("welcome")).click();
		    driver.findElement(By.linkText("Logout")).click();
		  }
	
	  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

	}

