package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSynchronization {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP laptops", Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Core i5']")).click();
	//	Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Brand']")).click();
		driver.findElement(By.xpath("//div[.='HP']")).click();
		driver.findElement(By.xpath("//div[.='Hard Disk Capacity']")).click();
		driver.findElement(By.xpath("//div[.='1 TB']")).click();
		driver.findElement(By.xpath("//div[.='Operating System']")).click();
		driver.findElement(By.xpath("//div[.='Windows 10']")).click();
	//	String priceOfLaptop = driver.findElement(By.xpath(
		//		"//div[.='HP Pavilion Gaming Core i5 11th Gen - (8 GB/1 TB HDD/256 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA G.."
			//	+ ".']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"))
				//.getText();
		driver.quit();
	//	System.out.println(priceOfLaptop + " " + "This is the price of Laptop");

	}

}
