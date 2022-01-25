package mousekeyboardope;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelogin {

	public static void main(String[] args) throws Exception {
		//step-1: open browser
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//enter url
		driver.get("https://demo.actitime.com/login.do");
		//implicit wait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Thread.sleep(2000);
			WebElement	uname=driver.findElement(By.id("username"));
			uname.sendKeys("admin",Keys.TAB);
			Thread.sleep(2000);
			driver.get("https://www.flipkart.com");
			//to remove popup
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
				

	}

}
