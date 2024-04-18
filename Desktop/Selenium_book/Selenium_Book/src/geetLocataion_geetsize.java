import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class geetLocataion_geetsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allows-origin=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		//get size of an element.height &width
		Dimension dimension   = driver.findElement(By.name("search")).getSize();
		
		
		System.out.println("The height is "+dimension.getHeight());
		System.out.println("The width is "+dimension.getWidth());
		Point p = driver.findElement(By.name("search")).getLocation();
		System.out.println("The location is x axis  "+p.x);
		System.out.println("The location is y axis "+p.y);
		
		
		
		driver.close();
		

	}

}
