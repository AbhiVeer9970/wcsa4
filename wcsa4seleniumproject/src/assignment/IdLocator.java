package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.jmx.ManagedAttribute;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(4000);
	driver.findElement(By.name("Username")).sendKeys("Admin");
	Thread.sleep(4000);
	driver.findElement(By.name("password")).sendKeys("manager@12");
	
	}

}
