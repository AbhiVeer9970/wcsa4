package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
     driver.get("http://omayo.blogspot.com/");
    WebElement TextOfLink = driver.findElement(By.partialLinkText("Open a popup window"));
    TextOfLink.click();
    Thread.sleep(2000);
    driver.quit();
     
	}

}
