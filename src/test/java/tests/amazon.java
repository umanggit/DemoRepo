package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazon {

	WebDriver driver = null;

	@BeforeTest

	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja Bajaj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test

	public void launchamazon() throws InterruptedException
	{
		driver.get("https://amazon.in");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("title is" +title);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java programming books");
		
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(.,'Java')][1]")).click();
		


		/*		driver.findElement(By.cssSelector(".a-dropdown-prompt")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Price: Low to High")).click();

		Thread.sleep(3000);*/
		Thread.sleep(30000);


		driver.findElement(By.xpath("//li[7]/a")).click();

		Thread.sleep(3000);


		List<WebElement> booksprice = driver.findElements(By.cssSelector("span.a-price-whole"));

		System.out.println("No is" +booksprice.size());

		//to get the lowest prices
		ArrayList<Integer> prices=new ArrayList<Integer>();

		for(int i=0; i<booksprice.size(); i++){
			System.out.println(booksprice.get(i).getText());
			Integer intPrice = Integer.valueOf(booksprice.get(i).getText().replace(",", ""));

			prices.add(intPrice);
		}
		Integer minPrice = Collections.min(prices);
		System.out.println("Min Price is "+minPrice);


		//compare all the prices with lowest price and click the book button
		List<WebElement> allBookbtn = driver.findElements(By.cssSelector("span.a-price-whole"));
		Thread.sleep(3000);
		for(int i=0;i<booksprice.size();i++){
			Integer priceInt1 = Integer.valueOf(booksprice.get(i).getText().replace(",", ""));
			//String price1 = price.get(i).getText();
			//		System.out.println(priceInt1);
			if (priceInt1.equals(minPrice)){
				allBookbtn.get(i).click();
				break;

			}
		}

		// to print title of newly opened Tab
		String title1 = driver.getTitle();
		System.out.println("title is" +title1);

		Thread.sleep(3000);

		//		String windowHandle = driver.getWindowHandle();
		//		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		//      System.out.println("tab size" +tabs.size());

		//	driver.findElement(By.id("add-to-cart-button")).click();

		// to switch to original Tab
		String Tab1 = driver.getWindowHandle(); 
		ArrayList<String> availableWindows = new ArrayList<String>(driver.getWindowHandles()); 
		if (!availableWindows.isEmpty()) { 
			driver.switchTo().window(availableWindows.get(0)); 
		}

		Thread.sleep(3000);

	}

	@AfterTest

	public void aftertest ()
	{
		//		driver.close();
	}
}
