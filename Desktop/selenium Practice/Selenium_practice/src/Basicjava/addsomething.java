package Basicjava;







import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class addsomething {

	public static void main(String[] args)throws Exception {
		 {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allows-origin=*");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		Dimension d =new Dimension(200,200);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p = new Point(250,250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		
	
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		//driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
		 }
	}
}

		

	


