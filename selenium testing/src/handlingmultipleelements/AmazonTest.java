package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		//step1:open browser
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//implicitely wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//enter required  url
				driver.get("https://www.Amazon.in");
				//driver.findelements(By.cssSelector())
				List <WebElement> mainmenu=driver.findElements(By.cssSelector("#nav-xshop>a"));
				System.out.println("main menu option count:"+mainmenu.size());
				for(int i=0;i<mainmenu.size();i++) {
					if(mainmenu.get(i).isDisplayed()) {
						System.out.println(mainmenu.get(i).getText());
					}
					else {
						System.out.println("with innerHTML attribute:"+mainmenu.get(i).getAttribute("innerHTML"));
					}
				}
		

	}

}
