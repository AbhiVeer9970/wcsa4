package cssSelectorPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeAutomaticLogin {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver =new ChromeDriver();
	driver.get("https://timetracker.ctepl.com/actitime/login.do");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type*='x']")).sendKeys("Abhi");
	driver.findElement(By.cssSelector("input[type^='p']")).sendKeys("Abhi@123");
	
    //driver.findElement(By.cssSelector("a[href*='ti']")).click();
	
	
	
	
	driver.findElement(By.cssSelector("img[src*='.0")).click();
	
	
	//driver.findElement(By.cssSelector("td[class*='hea']")).click();
	
	
	
	
	
//	driver.findElement(By.cssSelector("input[type*='k']")).click();
	
	
	
	
	//driver.findElement(By.cssSelector("a[id*='B']")).click();
	
	Thread.sleep(2000);
	driver.close();
	}

}
