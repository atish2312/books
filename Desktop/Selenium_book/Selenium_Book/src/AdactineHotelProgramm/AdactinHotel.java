package AdactineHotelProgramm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//url
		driver.get("https://adactin.com/HotelApp/index.php");
		
		//use of name locator
		driver.findElement(By.name("username")).sendKeys("testeratish");
		driver.findElement(By.name("password")).sendKeys("testeratish");
		
		//use to get text to show value enter in the text box
		System.out.println(driver.findElement(By.name("username")).getText());
		
		//use to getattribure  text to show to what i enter in text box
		System.out.println(driver.findElement(By.name("password")).getAttribute("value"));
		
		//use id
				driver.findElement(By.id("login")).click();
				
				//goback
				driver.navigate().back();
				
				//use the link text locator
				
				driver.findElement(By.linkText("Forgot Password?")).click();
				Thread.sleep(2000);

		driver.close();
		
	}

}
