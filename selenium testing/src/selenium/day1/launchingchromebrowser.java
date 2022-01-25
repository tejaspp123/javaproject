package selenium.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchingchromebrowser {

	public static void main(String[] args) {
		//set the path of chromedriver.exe using  setproperty() of system class
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejal Patil\\Desktop\\seleniun program\\selenium testing\\driver\\chromedriver.exe");
		//set relative path driver
		//System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		
		//create an object of chromedriver class open chrome driver
		ChromeDriver cdriver =new ChromeDriver();

	}

}
