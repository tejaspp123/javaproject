package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitimetask {
	WebDriver driver;
  @Test(priority=0)
  public void openbrowserandlogin() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 driver=new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//enter url
		driver.get("https://demo.actitime.com/login.do");
		//enter username and password
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//login
		driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
		Thread.sleep(2000);
  }
  
  @Test(priority=1)
  public void createandverifytask() throws InterruptedException {
	  //task
	WebElement task=driver.findElement(By.xpath("//div[text()='Tasks']"));
	task.click();
		Thread.sleep(2000);
		//add new
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(2000);
		//create new task
		driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		Thread.sleep(2000);
		//select customer
		WebElement selectcustomerbox=driver.findElement(By.xpath("//div[@class='comboboxButton']"));
		selectcustomerbox.click();
		
//		//select customer no
	WebElement customerno=driver.findElement(By.xpath("//div[text()='- New Customer -']/following-sibling::div[3]"));
		customerno.click();
		Thread.sleep(2000);
		//select project
		WebElement selectproj=driver.findElement(By.xpath("//div[text()='- New Project -']"));
	
		Thread.sleep(2000);
		//enter task
		WebElement Etask=driver.findElement(By.xpath("//input[@placeholder='Enter task name']"));
				Etask.click();
		Etask.sendKeys("person3");
		Thread.sleep(2000);
		
		//checkboxbutton
		driver.findElement(By.xpath("//td[@class='addToTTCell']/label/span[2]")).click();
		Thread.sleep(2000);
		//create box
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		Thread.sleep(2000);
//		//select person2 checkbox
//		WebElement cbox=driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/td/div/div[@class='img']"));
//		cbox.click();
//	Thread.sleep(2000);
//	List <WebElement> allcbox=driver.findElements(By.xpath("//div[@class='taskRowsTableContent']"));

	
  }
		
  

  
//  @Test(priority=2)
//  public void modifyandverifytask() {
//  }
//  
//  
//  @Test(priority=3)
//  public void deleteandveryfytask() {
//  }
//  
 
  @Test(priority=2)
  public void logoutandclose() throws InterruptedException  {
	 WebElement logoutlink=driver.findElement(By.xpath("//a[text()='Logout']"));
	 logoutlink.click();
	 Thread.sleep(2000);
	 driver.close();
  }
}
