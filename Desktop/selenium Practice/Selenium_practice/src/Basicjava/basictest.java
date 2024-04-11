package Basicjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class basictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions n = new ChromeOptions();
		n.addArguments("--remote-allows-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		

	}

}
