package Booksbyatish;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingbrowerbyuserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the name of brower");
		String brower = obj.nextLine();
		WebDriver driver = null;
		if(brower.equals("chrome")) {
			System.setProperty("Webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			obj.close();
		}
		
		driver.close();
		
		
		
		

	}

}
