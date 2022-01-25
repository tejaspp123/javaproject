package mousekeyboardope;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//full screen
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	//locate freebook
	WebElement freeEbook=driver.findElement(By.xpath("//li[@id='menu-item-7128']"));
	
	//mouse operation
	Actions action=new Actions(driver);
//action.moveToElement(freeEbook).perform();
//action.moveToElement(freeEbook,100,0).perform();
action.moveByOffset(-100,0).perform();
Thread.sleep(2000);

	}

}
