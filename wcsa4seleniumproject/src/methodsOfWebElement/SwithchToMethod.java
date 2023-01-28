package methodsOfWebElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https:/www.instagram.com/");
		driver.navigate().to("https://www.google.co.in/");
        Thread.sleep(4000);
        driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
        
    	Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}

}
