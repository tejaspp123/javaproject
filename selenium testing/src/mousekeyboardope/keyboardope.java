package mousekeyboardope;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardope {

	public static void main(String[] args) {
		//step-1: open browser
				System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//maximize window
				driver.manage().window().maximize();
				//enter url
				driver.get("https://www.gsmarena.com/samsung-phones-9.php");
				//implicit wait
//						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//						driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//						driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//						driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//						driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//						driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
				driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
				

	}

}
