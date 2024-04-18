package NavigateCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allinone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
	//first url
		driver.get("https://www.google.com/");
	
		//navigate to 
		driver.navigate().to("https://facebook.com/");
	
		//navigate back
		
		driver.navigate().back();
		
		//navigate // forward
		
		driver.navigate().forward();
		
		//navigate referesh 
		
		driver.navigate().refresh();
		
		

	}

}
