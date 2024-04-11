package Basicjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationgetallvaluesusingselectofdateofbirth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allows-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("tester");
		driver.findElement(By.name("lastname")).sendKeys("Atish");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testeratish123@yopmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("testeratish123@yopmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("testeratish");
		WebElement w = driver.findElement(By.id("day"));
		Select s = new Select(w);
		List<WebElement>o = s.getOptions();
		for(WebElement x :o) {
			System.out.println(x.getText());
		}
		
		Thread.sleep(2000);
//		driver.quit();
		

	}

}
