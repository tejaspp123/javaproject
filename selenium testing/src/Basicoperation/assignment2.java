package Basicoperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("https://www.facebook.com");
		//page title
		String actualtitle=driver.getTitle();
		String expectedtitle="Facebook – log in or sign up";
		if(expectedtitle.equals(actualtitle)) {
			System.out.println("title match");
		}
		else {
			System.out.println("title not match");
		}
			
		System.out.println("home page title:"+actualtitle);
		
	
		

	}

}
