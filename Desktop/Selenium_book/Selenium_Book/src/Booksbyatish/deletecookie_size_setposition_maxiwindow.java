package Booksbyatish;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletecookie_size_setposition_maxiwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//delete cookie
		driver.manage().deleteAllCookies();
		
		//set size of the window
		Dimension sd = new Dimension(500,500);
		driver.manage().window().setSize(sd);
		
		//to set position of the window
		Point p = new Point(100,200);
		driver.manage().window().setPosition(p);
		
		//maximum window
		driver.manage().window().maximize();
		

	}

}
