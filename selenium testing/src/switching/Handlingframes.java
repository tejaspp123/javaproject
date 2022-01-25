package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Handlingframes extends seleniumutils{
	static WebDriver driver;
  @Test
  public void testframes() throws InterruptedException {
	  driver=setUp("chrome","https://www.jqueryui.com");
	  driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
	  //taking control inside the frame from main page
	  driver.switchTo().frame(0);
	 Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#tags")).sendKeys("ja");
	Thread.sleep(2000);
	  driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	  //comming back to main/home page from the frame
	  driver.switchTo().defaultContent();
	  driver.findElement(By.cssSelector(".logo")).click();
	  Thread.sleep(2000);
}
  
}
