package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
