package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimelogin {



	public static void main(String[] args) {
	/*
	 * 1.open browser
	 * 2.enter the url
	 * 3. veryfy login page title is 'actitime-Login'
	 * 4. enter username as admin
	 * 5. enter password as manager
	 * 6.click on login button
	 * 7.veryfy home page title is 'actiTIME-Enter Time-Track'
	 * 8.close the browser
	 * 
	 */
		// step-1 open the browser
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//step-2 enter the url
		driver.get("https://demo.actitime.com/login.do");
		//implicit wait: Interface>Interface>Interface>abstract method
		/*webdriver->manage->Timeouts->implicitlywait*/
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		//step-3 loginpage title 
		System.out.println("page title before login:"+driver.getTitle());
		//step-4 locate and enter username
		driver.findElement(By.id("username")).sendKeys("admin");
		//step-5 locate and enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//step-6 locate and click login button
		driver.findElement(By.id("loginButton")).click();
		WebElement logoutLink=driver.findElement(By.linkText("Logout"));
		
		
		//explicit wait-->webdriverwait
		WebDriverWait wait=new WebDriverWait(driver,20);
	
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		//step-7
		System.out.println("page title after login:"+driver.getTitle());
		/*step-8 identify logout button and click on it*/
		 logoutLink.click();
	 //step-9
		 driver.close();
		
		
		
		
		

	}

}
