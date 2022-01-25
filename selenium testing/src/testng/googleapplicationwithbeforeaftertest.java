package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleapplicationwithbeforeaftertest {
	WebDriver driver;
	
	@BeforeTest
	public void openbrowser() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		System.out.println("before test");
		Thread.sleep(2000);
		
	}
  @Test
  public void testgooglelandingpage() {
	  String expectedTitle="Google";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle,"either google search page not open or page title got changed");
	  System.out.println("Tc1:testgooglelandingpage is finish");
  }
  @Test
  public void testsearch() throws InterruptedException {
	WebElement searchinputfield= driver.findElement(By.name("q"));
	Assert.assertTrue(searchinputfield.isDisplayed());	
	Assert.assertTrue(searchinputfield.isEnabled());
	searchinputfield.sendKeys("sql question",Keys.ENTER);
	
	System.out.println(driver.getTitle());
	System.out.println("testsearch finished");
	
  }
  
  @AfterTest
  public void backtomainpage() {
	  driver.navigate().back();	
	  System.out.println("after test");
	  
 }
}
