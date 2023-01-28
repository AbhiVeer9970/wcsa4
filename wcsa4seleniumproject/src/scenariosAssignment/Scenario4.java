package scenariosAssignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario4 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.ebay.com/");

		Actions act = new Actions(driver);
		Robot robot = new Robot();
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Apple watches");
		// driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.xpath("//select[@name='_sacat']")).click();
		for (int i = 0; i <= 20; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("gh-btn")).click();
		String allOptions = driver.findElement(By.xpath("//html[@class=' history devicemotion deviceorientation']"))
				.getText();
		System.out.println(allOptions);
	}

}
