package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//enter url
		driver.get("https://www.gsmarena.com/");
	WebElement option=driver.findElement(By.cssSelector(".brandmenu-v2.light li:nth-of-type(1)"));
	option.click();
	List<WebElement> moption=driver.findElements(By.cssSelector(".makers li span"));
	System.out.println("count:" + moption.size());
	for(int i=0;i<moption.size();i++) {
		System.out.println(moption.get(i).getText());
		
		
	}
			
	
	
	

	}

}
