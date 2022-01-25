package mousekeyboardope;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//enter url
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//switch to frame
		
				driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
			WebElement src1=driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
			WebElement src2=driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
			WebElement src3=driver.findElement(By.xpath("//ul[@id='gallery']/li[3]"));
			WebElement src4=driver.findElement(By.xpath("//ul[@id='gallery']/li[4]"));
			WebElement target=driver.findElement(By.id("trash"));
			Actions action=new Actions(driver);
//			action.dragAndDrop(src1, target).build().perform();
//			Thread.sleep(2000);
//			action.dragAndDrop(src2, target).build().perform();
//			Thread.sleep(2000);
//			action.dragAndDrop(src3, target).build().perform();
//			Thread.sleep(2000);
//			action.dragAndDrop(src4, target).build().perform();
//			Thread.sleep(2000);
//			System.out.println("done");
	}

}
