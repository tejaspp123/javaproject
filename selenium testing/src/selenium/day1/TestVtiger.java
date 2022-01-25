package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVtiger {

	public static void main(String[] args) {
		//step1: open browser
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//step2:Enter the url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//implicit wait:Interface->Interface->Interface->abstract method
		/*webdriver ->Manage->Timeouts->implicitlywait */
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//full screen browser
		driver.manage().window().maximize();
		//step3:login page title
		System.out.println("page title before login:"+driver.getTitle());
		/* step4:locate username field ,0-20 sec ---->2sec*/
	WebElement username=driver.findElement(By.id("username"));
	System.out.println("username visibility is:"+username.isDisplayed());
	System.out.println("username is editable or not:"+username.isEnabled());
	username.clear();
	username.sendKeys("admin");
	/*step5:locate password field,0-20 sec ---->10 secs */
	WebElement pwd=driver.findElement(By.id("password"));
	System.out.println(pwd.isDisplayed());
	System.out.println(pwd.isEnabled());
	pwd.clear();
	pwd.sendKeys("Test@123");
	/* step6:locate login button 0-20 sec ----> 9 sec*/
	WebElement loginbutton=driver.findElement(By.tagName("button"));
	System.out.println("loginbutton.isDisplayed()");
	System.out.println("loginbutton.isenabled()");
	loginbutton.click();
	driver.findElement(By.className("userName")).click();
	driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		

	}

}
