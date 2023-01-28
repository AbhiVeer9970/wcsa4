package assignment;

import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentonBlueStone {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiA76-dBhByEiwAA0_s9fcEzHAnZigutqJsunOYI4mW13jQhOJ8uCZyTGqIC8TVG_bcKfb7sRoCacIQAvD_BwE");
		Actions act = new Actions(driver);
		
	   driver.findElement(By.xpath("//a[text()='Watch Jewellery ']")).click();
	   driver.findElement(By.xpath("//a[text()='Band']"));
	  // act.doubleClick()
		
	}

}
