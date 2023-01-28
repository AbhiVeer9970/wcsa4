package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatInstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abhishek");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pas@123");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']")).click();

	}

}
