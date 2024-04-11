package Basicjava;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Userinputchrome {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the browers name");
		String browser = src.nextLine();
		WebDriver driver = null;
		if(browser.equals("Chrome"))
				{
			ChromeOptions ch = new ChromeOptions();
			ch.addArguments("--remote-allows-origins=*");
			driver = new ChromeDriver();
			driver.get("file:///C:/Users/User/Desktop/selenium%20book/Selenium%20Full%20Material%20Updated%20Greens.pdf");
		}
		if(browser.equals("Firefox")){
			FirefoxOptions ff = new FirefoxOptions();
			ff.addArguments("--remote-allows--origin=*");
			driver = new FirefoxDriver();
			
		}
		else {
			System.out.println("Something Wrong");
			Thread.sleep(2000);
		}
		src.close();
		
		

	}
	}


