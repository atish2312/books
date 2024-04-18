import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Usingcssvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allows-origin=*");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	WebElement x = driver.findElement(By.className("build_title"));
	System.out.println("The Font size is "+x.getCssValue("font-size"));
	List<WebElement> a= driver.findElements(By.tagName("a"));
	System.out.println(a.size());
	for(WebElement x1 :a) {
		System.out.println(x1.);
	}

	}

}
