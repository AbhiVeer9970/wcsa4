package methodsOfWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.instagram.com/");
		String SourceCode = driver.getPageSource();
        Thread.sleep(4000);
        System.out.println(SourceCode);

	}

}
