package handlingmultipleelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingmultipleelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to webdriver interface
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//enter required application url
		driver.get("https://www.google.com");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement searchinputfield=driver.findElement(By.name("q"));
		searchinputfield.sendKeys("selenium testing");
		//to identify multiple webelement
		
		
		
		
		
		
		
		

	}

}
