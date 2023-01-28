package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopPrice {

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP laptops", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Core i5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Brand']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='HP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Hard Disk Capacity']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='1 TB']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Operating System']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Windows 10']")).click();
		Thread.sleep(3000);
		String priceOfLaptop = driver.findElement(By.xpath(
				"//div[.='HP Pavilion Gaming Core i5 11th Gen - (8 GB/1 TB HDD/256 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA G.."
				+ ".']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"))
				.getText();
		Thread.sleep(4000);
		driver.quit();
		System.out.println(priceOfLaptop + " " + "This is the price of Laptop");

	}

}
