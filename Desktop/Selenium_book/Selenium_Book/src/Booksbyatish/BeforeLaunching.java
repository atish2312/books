package Booksbyatish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeLaunching{
	
	public static void main(String []args) {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
	}
}
	
