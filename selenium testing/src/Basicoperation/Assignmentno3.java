package Basicoperation;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentno3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String s=driver.getPageSource();
		System.out.println(s.length());
		driver.get("https://demo.actitime.com");
		String paget=driver.getTitle();
		System.out.println("page title:"+paget);
		System.out.println("page title length"+paget.length());
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://demo.actitime.com/login.do";
		if (actualurl.equals(expectedurl)) {
			System.out.println("correct page open");
		}
		else
		{
			System.out.println("correct page not open");
		}
		
		 
	
		 
		

	}

}
