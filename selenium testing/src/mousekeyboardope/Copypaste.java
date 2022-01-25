package mousekeyboardope;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypaste {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//enter url
		driver.get("https://demo.actitime.com/login.do");
		WebElement uname=driver.findElement(By.id("username"));
		WebElement pass=driver.findElement(By.name("pwd"));			;
		uname.sendKeys("wwwww",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(3000);
		pass.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		 
		

	}

}
