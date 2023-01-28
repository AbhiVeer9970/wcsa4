package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneOrder {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/search?q=iphone+14+pro+max&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_6_6_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_6_6_na_na_na&as-pos=6&as-type=RECENT&suggestionId=iphone+14+pro+max&requestId=88b85e28-e19e-4b11-8117-9c13d823e939&as-searchtext=iphone");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='256 GB']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//li[@class='col col-6-12'])[1]")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
