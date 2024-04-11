package Basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doubleclickingcheck {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("-remote-allows-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(2000);
		
		
		

	}

}
