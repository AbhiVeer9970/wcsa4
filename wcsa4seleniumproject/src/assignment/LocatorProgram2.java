package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorProgram2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		//driver.findElement(By.className("_2IX_2- VJZDxU").("9970994100");
		//driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU").cssSelector("Abhi@1200");
		
		
	}

}
