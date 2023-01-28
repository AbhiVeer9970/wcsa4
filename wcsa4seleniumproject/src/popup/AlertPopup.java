package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/91997/OneDrive/Desktop/html%20components/Popup.html");
		WebElement button = driver.findElement(By.xpath("//button[.='Click me! ']"));
		button.click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept();
		//al.dismiss();
		al.sendKeys("Admin");
		String text = al.getText();
		System.out.println(text);
	}

}
