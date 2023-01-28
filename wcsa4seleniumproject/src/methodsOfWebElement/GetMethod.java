package methodsOfWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrom.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:/www.instagram.com/");
	Thread.sleep(4000);
	driver.close();

	}

}
