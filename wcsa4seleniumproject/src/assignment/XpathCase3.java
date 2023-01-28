package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase3 {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://desktop-abhi/login.do");
   Thread.sleep(3000);
   driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Abhi");
   driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("Pass123");
   driver.findElement(By.xpath("//input[contains(@name,'remember')]")).click();
   //driver.findElement(By.xpath("//a[contains(@class,'i')]")).click();
   driver.findElement(By.xpath("//a[contains(.,'License ')]")).click();
   
	}

}
