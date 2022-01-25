package selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class launchingallbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		
				//create an object of chromedriver class open chrome driver
				ChromeDriver cdriver =new ChromeDriver();
System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
				
				//open firefoxbrowser driver
				FirefoxDriver fdriver =new FirefoxDriver();
				// set the path of IEdriverserver.exe using setproperty() of system class
				System.setProperty("webdriver.ie.driver","C:\\Users\\Tejal Patil\\Desktop\\seleniun program\\selenium testing\\driver\\IEDriverServer.exe");
		//with relative path
				//System.setProperty("webdriver.ie.driver",".\\driver\\IEDriverServer.exe");
				InternetExplorerDriver idriver=new InternetExplorerDriver();
				WebDriver idriver1=new InternetExplorerDriver();
				



	}

}
