package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("which browser open");
		String browserValue = sc.next();
		
		if (browserValue.equalsIgnoreCase("chrome")) {
		//System.setProperty("webdriver.chrome.driver","./deivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.instagram.com/");
		Thread.sleep(2000);
		driver.close();}
		
		else {
			System.out.println("enter valid browser");}
		}
		
       //new ChromeDriver();
	}

