package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-abhi/login.do");

		WebElement NameTextBox = driver.findElement(By.name("username"));
		WebElement PassTextBox = driver.findElement(By.name("pwd"));
		NameTextBox.sendKeys("Admin");
		PassTextBox.sendKeys("Manager");
	}

}
