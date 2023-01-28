package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopPrize {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.flipkart.com/search?q=hp+laptos&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off&as-pos=1&as-type=HISTORY");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//div[text()='Core i7']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='HP']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	Thread.sleep(4000);
	String prize = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	Thread.sleep(4000);
	System.out.println(prize+" is the prize of laptop");
	Thread.sleep(4000);
	driver.quit();

	
	}

}
