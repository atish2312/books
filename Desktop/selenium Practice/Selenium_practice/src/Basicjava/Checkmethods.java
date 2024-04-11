package Basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkmethods {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://www.facebook.com/");
		boolean logo =  driver.findElement(By.xpath("//img[@alt='Facebook']")).isEnabled();
		if(logo == true) {
			System.out.println("This is showing on the screen");
		}
		else {
			System.out.println("They are not showing");
		}
		 
		 driver.quit();
		

	}

}
