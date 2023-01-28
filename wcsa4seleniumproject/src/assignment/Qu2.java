package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu2 {
//close the Parent window and child window without using qutit ();
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindowHandle = driver.getWindowHandles();
		for (String wh:allWindowHandle) {
			
		}
		


	}
	}


