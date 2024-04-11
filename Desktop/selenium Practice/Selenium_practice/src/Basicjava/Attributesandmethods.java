package Basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Attributesandmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allows-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("atishkumar");
		System.out.print(driver.findElement(By.id("email")).getAttribute("value"));
		System.out.println(driver.findElement(By.id("email")).getText();

	}

}
	