package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("flipkart", Keys.ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[.='Flipkart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung mobile");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);

		String PriceOfMobile = driver.findElement(By.xpath(
				"//div[.='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"))
				.getText();
		driver.quit();

		System.out.println(PriceOfMobile + " " + "this is the Price of mobile");

	}

}
