package mousekeyboardope;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouse1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//enter url
		driver.get("http://vtiger-demo.it-solutions4you.com/index.php");
		//locate username and password
		WebElement uname=driver.findElement(By.name("username"));
		WebElement pass=driver.findElement(By.id("password"));
		uname.clear();
		pass.clear();
		Thread.sleep(2000);
		/*
		 * to perform mouse related operation 
		 * step-1:create an instance of Action class and pass as argument driver into its constructor
		 * Action action=new Action(driver)
		 * 
		 */
Actions action =new Actions(driver);
uname.sendKeys("admin");
//double click operation
 action.doubleClick(uname).build().perform();
 Thread.sleep(2000);
 //or
 //action.moveToElement(uname).build().perform();
 //right click
 action.contextClick(uname).build().perform();
 Thread.sleep(2000);
 //click and hold
 action.clickAndHold(uname).build().perform();
 Thread.sleep(2000);
 action.moveToElement(uname).release().build().perform();
 
		
	
		

	}

}
