package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartmenu {

	public static void main(String[] args) {
		//Step1: open browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://www.flipkart.com");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> flipfunction=driver.findElements(By.cssSelector("div[class=\"_37M3Pb\"]>div>a"));
		System.out.println("count:"+flipfunction.size());
		for(int i=0;i<flipfunction.size();i++) {
			System.out.println(flipfunction.get(i).getText());
			
		}
		
		
		
		

	}

}
