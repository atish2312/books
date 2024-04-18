package FacebookRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allows-origin=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		//check logo is here are not 
		boolean s5 = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(s5==true) {
			System.out.println("This is display ");
		}
		else {
			System.out.println("something went wrong");
		}

		driver.findElement(By.name("firstname")).sendKeys("Atish");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("9877936415");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Atish123!");
		Select s = new Select(driver.findElement(By.id("day")));
		s.selectByValue("27");
		Select s1 = new Select(driver.findElement(By.id("month")));
		s1.selectByValue("6");
		Select s2 = new Select(driver.findElement(By.id("year")));
		s2.selectByValue("2002");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
