package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectSelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/91997/OneDrive/Desktop/html%20components/Multipal%20_select_dd.html");
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropDownElement);
		Thread.sleep(3000);
		sel.selectByIndex(4);

	}

}
