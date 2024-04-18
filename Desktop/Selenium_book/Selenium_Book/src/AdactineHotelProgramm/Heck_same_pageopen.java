package AdactineHotelProgramm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heck_same_pageopen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		
		//use of name locator
		driver.findElement(By.name("username")).sendKeys("testeratish");
		driver.findElement(By.name("password")).sendKeys("testeratish");
		driver.findElement(By.id("login")).click();
		System.out.println(driver.getCurrentUrl());
		String s= driver.getCurrentUrl();
		if(s.equals("https://adactinhotelapp.com/SearchHotel.php")) {
			System.out.println("We are got right page");
		}
		else {
			System.out.println("Something wrong");
		}
		

	}

}
