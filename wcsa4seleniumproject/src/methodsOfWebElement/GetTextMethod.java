package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
   driver.get("http://omayo.blogspot.com/");
   WebElement Link = driver.findElement(By.partialLinkText("popup window"));
     String textOfLink = Link.getText();
     System.out.println(textOfLink);
    
	}

}
