package window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import switching.seleniumutils;

public class testwindow1 extends seleniumutils {
	static WebDriver driver;
  @Test
  public void testwindow1() {
	  driver=setUp("chrome","https://demoqa.com/browser-windows");
	  System.out.println("current window url:"+driver.getCurrentUrl());
	  //current window id
	 String homewin=driver.getWindowHandle();
	 System.out.println("current window id:"+homewin);
	 //click on new window button
	 driver.findElement(By.id("windowButton")).click();
	Set<String> allwin=driver.getWindowHandles();
	System.out.println("all window id:"+allwin);
	allwin.remove(homewin);
       String childwin=allwin.iterator().next();
     //switch control to child window
   	driver.switchTo().window(childwin);
	
	
	System.out.println("child window id"+childwin);
	
	System.out.println("childwindow url:"+driver.getCurrentUrl());
	driver.close();
	//switch to parent window
	driver.switchTo().window(homewin);
	driver.close();
	
	 
  }


}
