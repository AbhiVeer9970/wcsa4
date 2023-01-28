package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91997/OneDrive/Desktop/html%20components/ConfirmatoinPopup.html");
		driver.findElement(By.xpath("//button[.='Click me! ']")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
		//al.dismiss();
		
		
	}

}
