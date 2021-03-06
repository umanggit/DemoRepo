package tests;


import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class SignOn extends BaseClass {
	

	@Test
	public void newContact() throws InterruptedException
	{

		
		    driver.get("https://full-asaimpact.cs19.force.com/cps/TSSignOn?source=DIRECT_LINK&l=nJvY2t0b24");
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("j_id0:tSSignOnForm:firstname")).sendKeys("FN");
		    
		    Thread.sleep(1000);
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("j_id0:tSSignOnForm:middleInitial")).sendKeys("MN");
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("j_id0:tSSignOnForm:lastname")).sendKeys("LN");
		    
		    Thread.sleep(1000);
		    
		    Select se = new Select(driver.findElement(By.name("j_id0:tSSignOnForm:j_id56")));
		    se.selectByIndex(2);
		    
		    Thread.sleep(2000);
		    	   
		    
//			WebElement date =  driver.findElement(By.id("j_id0:tSSignOnForm:txtDate"));
		  
		    WebElement we = driver.findElement(By.id("j_id0:tSSignOnForm:txtDate"));
		    we.sendKeys(Keys.ENTER);
//		    we.sendKeys("11/18/1998");
		    
		        
		    Thread.sleep(3000);
		    
//		    JavascriptExecutor jse = (JavascriptExecutor)driver;
//		    js.executeScript("arguments[0].value='20000101';", we);
		    

		    
//		   MobileElement ele1 = driver.findElement(By.id("android:id/button1"));
//		   ele1.click();
		    
		     
		    WebElement ele1 = (WebElement) driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']"));
		     ele1.click();
		    				    
		    Thread.sleep(5000);
		    
		    driver.findElement(By.id("j_id0:tSSignOnForm:studentidts")).sendKeys("01011990");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("j_id0:tSSignOnForm:TSEmail")).sendKeys("umang.jain@buena.tech");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("j_id0:tSSignOnForm:TSParentEmail")).sendKeys("umang.jain@buena.tech");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("j_id0:tSSignOnForm:mobilePhonets")).sendKeys("010119901234");
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("j_id0:tSSignOnForm:submit")).click();
		    
		    Thread.sleep(2000);
		  		    
		   


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

