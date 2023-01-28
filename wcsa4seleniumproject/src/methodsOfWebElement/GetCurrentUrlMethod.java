package methodsOfWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.instagram.com/");
		String currentUrl = driver.getCurrentUrl();
        Thread.sleep(4000);
        System.out.println(currentUrl);

	}

}
