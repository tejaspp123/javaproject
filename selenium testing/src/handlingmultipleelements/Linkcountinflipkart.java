package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcountinflipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//full screen browser
		driver.manage().window().maximize();
		//enter url
		driver.get("https://www.flipkart.com");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		
		List<WebElement> flipkartlinks=driver.findElements(By.tagName("a"));
//		System.out.println("flipkart link count:"+flipkartlinks.size());
		
		
		
		

	}

}
