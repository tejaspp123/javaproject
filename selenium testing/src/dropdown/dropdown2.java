package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//enter url
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Tejas");
		driver.findElement(By.id("lastName")).sendKeys("patil");
		driver.findElement(By.id("userEmail")).sendKeys("Tejaspatil1137@gmail.com");
		driver.findElement(By.id("userNumber")).sendKeys("9096050685");
		WebElement male=driver.findElement(By.cssSelector(".custom-control-label"));
		male.click();
		//for music button
		//WebElement music=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
		//music.click();
		//for reading button
//		WebElement reading=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
//		reading.click();
		WebElement sport=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		sport.click();
		
		
		
		

		

	}

}
