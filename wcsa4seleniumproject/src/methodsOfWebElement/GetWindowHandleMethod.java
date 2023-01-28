package methodsOfWebElement;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println("-------------------------------------");

		Set<String> allHandle = driver.getWindowHandles();
		for (String wh : allHandle) {
			System.out.println(wh);
		}

	}

}
