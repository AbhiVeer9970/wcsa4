package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-abhi/login.do");
		
		WebElement NameTextBox = driver.findElement(By.name("username"));
		NameTextBox.sendKeys("Admin");
		
		
		WebElement PassTextBox = driver.findElement(By.name("pwd"));
		PassTextBox.sendKeys("Manager");
		Thread.sleep(2000);
		NameTextBox.clear();
		Thread.sleep(2000);
		PassTextBox.clear();

		
	}

}
