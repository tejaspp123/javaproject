package handlingmultipleelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQaForm {

	public static void main(String[] args) {
		//step1:open browser
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//enter required url
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//enter first name
	WebElement  Fname =driver.findElement(By.id("firstName"));
	Fname.sendKeys("Tejas");
	System.out.println(Fname.isDisplayed()+":"+Fname.isEnabled());
	
	//enter last name
		WebElement Lname=driver.findElement(By.id("lastName"));
		Lname.sendKeys("Patil");
		System.out.println(Lname.isDisplayed()+":"+Lname.isEnabled());
		//enter emailid
		WebElement emailid=driver.findElement(By.id("userEmail"));
		emailid.sendKeys("tejaspatil1137@gmail.com");
		System.out.println(emailid.isDisplayed()+":"+emailid.isEnabled());
		
		WebElement checkbox1=driver.findElement(By.id("gender-radio-1"));
		
	
	WebElement	element=driver.findElement(By.cssSelector("label[for=\"gender-radio-1\"]"));
		
		element.click();
		System.out.println(element.isDisplayed()+":"+element.isSelected()+":"+element.isEnabled());
		//for female button
//		WebElement checkbox2=driver.findElement(By .id("gender-radio-2"));
//		WebElement	element2=driver.findElement(By.cssSelector("label[for=\"gender-radio-2\"]"));
//		element2.click();
//		//for other button
//		WebElement checkbox3=driver.findElement(By .id("gender-radio-3"));
//		WebElement	element3=driver.findElement(By.cssSelector("label[for='gender-radio-3']"));
//		element3.click();

		//enter mob.number
		driver.findElement(By.id("userNumber")).sendKeys("9096050685");
		//enter subject
		driver.findElement(By.id("subjectsInput")).sendKeys("english");
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
//		WebElement element4=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
//		element4.click();
//		//or
//		WebElement element5=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
//		 element5.click();
		 //or
		 WebElement element6=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
		 element6.click();
		 driver.findElement(By.id("currentAddress")).sendKeys("khirode pra raver tal-raver dist-jalgaon");
		// driver.findElement(By.className(" css-1wa3eu0-placeholder")).sendKeys("MAHARASTRA");
		 //enter submit button
	
	
		 /**
			 * If the checkbox is getting selected/deselected by using checkbox symbol dn identify it using input tag attributes
			 * id its getting selected/deselected by using checkbox symbol & labels both dn for click use label tag attributes and for isSelected using input tag
			 */
			WebElement checkBox=driver.findElement(By.id("hobbies-checkbox-1"));			
			WebElement element7=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
			System.out.println(element7.isSelected()+":  "+element7.isDisplayed()+": "+element7.isEnabled());
			element.click();
			System.out.println("Using input for only selected: "+checkBox.isSelected()+":  "+element7.isDisplayed()+": "+element7.isEnabled());
			element.click();
			System.out.println("Using input for only selected: "+checkBox.isSelected()+":  "+element7.isDisplayed()+": "+element7.isEnabled());
			
			//scrolling
			driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
			
			WebElement button=driver.findElement(By.id("submit"));
			System.out.println(button.getText());
			button.click();
			
		
		
		 
		
		
		
		
		
	
		
		
		
		
		
		
		

	}

}
