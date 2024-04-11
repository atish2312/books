package Basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise1 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allows-origina=*");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("testeratish");
		driver.findElement(By.id("password")).sendKeys("testeratish");
		System.out.println(driver.findElement(By.id("username")).getText());
		System.out.println(driver.findElement(By.id("password")).getAttribute("value"));
		driver.findElement(By.id("login")).click();
		
		System.out.println(driver.getCurrentUrl());
		String s = driver.getCurrentUrl();
		if(s.equals("https://adactinhotelapp.com/SearchHotel.php")) {
			System.out.println("this is ok");
		}
		else {
			System.out.println("notok");
		}
		
		Thread.sleep(1000);
		driver.quit();
	}
}

		

	


