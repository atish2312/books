package FacebookRegistration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckErrromsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allows-origin=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("gdfg");
		driver.findElement(By.id("pass")).sendKeys("dfsfsdfs");
		driver.findElement(By.id("loginbutton")).click();
		WebElement obj = driver.findElement(By.className("_9ay7"));
		if (obj.isDisplayed()) {
			System.out.println(obj.getText());
		}
		driver.close();

	}

}
