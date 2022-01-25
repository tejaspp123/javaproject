package switching;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class active_element extends seleniumutils {
//  @Test(priority=0)
//  public void testelement() throws InterruptedException {
//	  WebDriver driver=setUp("chrome","https://demo.actitime.com/login.do");
//	  //get the active element from webpage
//	WebElement element= driver.switchTo().activeElement();
//String act=element.getAttribute("placeholder");
////verify username field
//Assert.assertEquals(act, "Username","by default control is not in username field");
//element.sendKeys("admin",Keys.TAB);
//Thread.sleep(2000);
////password field
//WebElement element2=driver.switchTo().activeElement();
//element2.sendKeys("manager",Keys.ENTER);
//  }
//@Test(priority=1)
//public void testgooglesearch() throws InterruptedException {
//	WebDriver driver=setUp("chrome","https://www.google.com");
//WebElement google =driver.switchTo().activeElement();
//
//String act=google.getAttribute("name");
////verify
//Assert.assertEquals(act,"q","by default search field not select");
//Thread.sleep(2000);
//google.sendKeys("selenium question",Keys.ENTER);
//}
@Test(priority=2)
public void fblogin() throws InterruptedException {
	WebDriver driver=setUp("chrome","https://www.facebook.com");
	WebElement phoneno=driver.switchTo().activeElement();
	Thread.sleep(2000);
phoneno.sendKeys("9921669157",Keys.TAB);
WebElement password=driver.switchTo().activeElement();
password.sendKeys("2831997",Keys.TAB,Keys.TAB);


	
}
}
