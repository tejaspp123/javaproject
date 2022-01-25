package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alertelement extends seleniumutils {
	WebDriver driver;
  @Test
  public void alert() throws InterruptedException {
	  driver=setUp("chrome","https://demoqa.com/alerts");
//	  //to open alert popup
//	  driver.findElement(By.id("alertButton")).click();
//	String  alerttext=driver.switchTo().alert().getText();
//	System.out.println("popup textname:"+alerttext);
//	Thread.sleep(2000);
//	//to accept alert or to click on ok or yes button
//	driver.switchTo().alert().accept();
//	  Thread.sleep(2000);
//	 
//	//to open confirmation popup
//	driver.findElement(By.id("confirmButton")).click();
//String alerttext1=driver.switchTo().alert().getText();
//System.out.println("confirm popup textname:"+alerttext1);
//Thread.sleep(2000);
////to accept alert or to click on ok or yes button
//	driver.switchTo().alert().accept();
//	//  Thread.sleep(2000);
//	//to click on cancel or no button
//	  //driver.switchTo().alert().dismiss();
//	  Thread.sleep(2000);
//to open prompt popup
//	  driver.findElement(By.id("promtButton")).click();
//	  Thread.sleep(2000);
//	  String promptbutton=driver.switchTo().alert().getText();
//	  System.out.println("prompt popup textname:"+promptbutton);
//	  Thread.sleep(2000);
//	  //type text in popup name
//	  driver.switchTo().alert().sendKeys("selenium testing");
//	  Thread.sleep(2000);
//	  //click on ok or yes button on popoup
//	  driver.switchTo().alert().accept();
	  handlealertpopup("accept");
	  Thread.sleep(2000);
	  handleconfirmpopup1("accept");
	  Thread.sleep(2000);
	  handlepromptpopup("accept");
	  
	  
	  
	  
	  }
 

void handlealertpopup(String popupaction) throws InterruptedException {
	 //to open alert popup
	  driver.findElement(By.id("alertButton")).click();
	String  alerttext=driver.switchTo().alert().getText();
	System.out.println("popup textname:"+alerttext);
	Thread.sleep(2000);
	//to accept alert or to click on ok or yes button
	if(popupaction.equals("accept")) {
	driver.switchTo().alert().accept();
 }
 else {
	 driver.switchTo().alert().dismiss();
	 
 }
 }
 
 
 
 void handleconfirmpopup1(String popupaction)  {
	//to open confirmation popup
		driver.findElement(By.id("confirmButton")).click();
	String alerttext1=driver.switchTo().alert().getText();
	System.out.println("confirm popup textname:"+alerttext1);
	
	
		if(popupaction.equals("accept")) {
			driver.switchTo().alert().accept();
		 }
		 else {
			 driver.switchTo().alert().dismiss();
			 
		 }
		 }
 
// 
// 
 void handlepromptpopup(String popupaction) throws InterruptedException {
	//to open prompt popup
	  driver.findElement(By.id("promtButton")).click();
	  Thread.sleep(2000);
	  String promptbutton=driver.switchTo().alert().getText();
	  System.out.println("prompt popup textname:"+promptbutton);
	  Thread.sleep(2000);
	  //type text in popup name
	  driver.switchTo().alert().sendKeys("selenium testing");
	  Thread.sleep(2000);
	  
	  if(popupaction.equals("accept")) {
			driver.switchTo().alert().accept();
		 }
		 else {
			 driver.switchTo().alert().dismiss();
			 
		 }
	  
 } 
  
  
  
  
  
  
}

