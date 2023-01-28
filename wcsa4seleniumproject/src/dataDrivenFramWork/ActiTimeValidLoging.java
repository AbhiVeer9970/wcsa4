package dataDrivenFramWork;

import java.time.Duration;

import org.asynchttpclient.config.AsyncHttpClientConfigHelper.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLoging {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
         Flib flib = new Flib();
       //  flib.readPropertyData("./data/Config.properties", "Url");
         
	}

}
