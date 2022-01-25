package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actitimeloginwithclasslevelannotation {
	WebDriver driver;
  @Test(priority=0)
  public void tc_1openbrowserandlogin() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  //enter url
	  driver.get("https://demo.actitime.com/login.do");
	  //locate username and password
	 WebElement username=driver.findElement(By.id("username"));
	WebElement  password=driver.findElement(By.name("pwd"));
	WebElement loginbutton=driver.findElement(By.xpath("//td[@id='loginButtonContainer']/a/div"));
	username.sendKeys("admin");
	Thread.sleep(2000);
    password.sendKeys("manager");
    Thread.sleep(2000);
	loginbutton.click();
	Thread.sleep(2000);
	
	
 }
  
  @Test(priority=1)
  public void tc_2logoutandclosebrowser() {
	WebElement logoutlink=driver.findElement(By.id("logoutLink"));
	WebDriverWait wait=new WebDriverWait(driver,20);
	System.out.println("page title after login:"+driver.getTitle());
	logoutlink.click();
	
	
	
	driver.close();
	
  
 
}


}

