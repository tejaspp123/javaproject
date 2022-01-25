package dropdown;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//enter required url
		driver.get("https://courses.letskodeit.com/practice");
//		//step1:locate the select button
//		WebElement dropdown =driver.findElement(By.id("carselect"));
//		//step2: create an instance of select class
//		Select skillselect=new Select(dropdown) ;
//		System.out.println("is multi selected or not"+skillselect.isMultiple());
//		System.out.println("size:"+skillselect.getOptions().size());
//		//print all the option
//		for(int i=0;i<skillselect.getOptions().size();i++) {
//			System.out.println(skillselect.getOptions().get(i).getText());
//		}
//		System.out.println("selected option" +skillselect.getFirstSelectedOption().getText());
//		//select any option from dropdown
//		skillselect.selectByIndex(2);
//		System.out.println("selected option by index:"+skillselect.getFirstSelectedOption().getText());
//		Thread.sleep(2000);
//		skillselect.selectByValue("benz");
//		System.out.println("selected option by value:"+skillselect.getFirstSelectedOption().getText());
//		Thread.sleep(2000);
//		skillselect.selectByVisibleText("BMW");
//		System.out.println("selected option by visible text:"+skillselect.getFirstSelectedOption().getText());
		System.out.println("********for multiselected*********");
		WebElement dropdown1=driver.findElement(By.id("multiple-select-example"));
		Select mselect=new Select(dropdown1);
		System.out.println("is multiselected or not:"+mselect.isMultiple());
		for(int i=0;i<mselect.getOptions().size();i++) {
			System.out.println(mselect.getOptions().get(i).getText());
		}
		Thread.sleep(2000);
		mselect.selectByIndex(1);
		
		Thread.sleep(2000);
		mselect.selectByIndex(2);
		System.out.println("select option:"+mselect.getAllSelectedOptions().size());
		for(int i=0;i<mselect.getAllSelectedOptions().size();i++) {
			System.out.println(mselect.getAllSelectedOptions().get(i).getText());
			
		}
		Thread.sleep(2000);
		mselect.deselectAll();
		
		
		
		
		

	}

}
