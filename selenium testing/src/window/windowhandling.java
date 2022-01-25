package window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import switching.seleniumutils;

public class windowhandling extends seleniumutils {
	static WebDriver driver;
	@Test
	public void testwindow() {
	driver=setUp("chrome","https://demoqa.com/browser-windows");
	System.out.println("home window currenturl:"+driver.getCurrentUrl());
	//to get current window id
String homewinid=driver.getWindowHandle();
System.out.println("current window id:"+homewinid);
//click on button to open new tab/window
driver.findElement(By.id("windowButton")).click();
//get window id of all the browser
Set<String> allwinid=driver.getWindowHandles();
System.out.println("all window id"+allwinid);//2win
//get child window id
allwinid.remove(homewinid);
System.out.println("allwin id after remove childwinid"+allwinid );
String childwinid=allwinid.iterator().next();
//after getting required childwinid switch control to that window
driver.switchTo().window(childwinid);
System.out.println("after opening new window current url:"+driver.getCurrentUrl());
//close child window
driver.close();
//after child window are close come back to the main page
driver.switchTo().window(homewinid);
System.out.println("after come back to the mainpage currenturl:"+driver.getCurrentUrl());
driver.close();
//to close all the window
//driver.quit();







	

}
}
