package cssSelectorPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeAutomaticLogin2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://integrator.actitime.com/auth/at");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("input[name*='T']")).sendKeys("Abhi123");

		
		driver.findElement(By.cssSelector("input[name*='n']")).sendKeys("99709942");
		
		
		
		driver.findElement(By.cssSelector("input[name*='as']")).sendKeys("Pass123");
		
		
		
		driver.findElement(By.cssSelector("button[class*='3 ']")).click();
		
		Thread.sleep(2000);


		
		
	}
}
