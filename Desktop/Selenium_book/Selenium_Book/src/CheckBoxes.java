import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxes {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allows-origin=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> a= driver.findElements(By.xpath("//input[@type='checkbox']"));
	//	for(WebElement i :a) {
			
			//i.click(); 
		
	//	} to all select element
		for(WebElement i : a) {
			if(i.getAttribute("value").equals("option1") || i.getAttribute("value").equals("option3")){
				i.click();
			}
			if(i.isSelected()) {
				System.out.println(i.getAttribute("value"));
			}
		}
		
		Thread.sleep(1000);
		
		
	}

}
