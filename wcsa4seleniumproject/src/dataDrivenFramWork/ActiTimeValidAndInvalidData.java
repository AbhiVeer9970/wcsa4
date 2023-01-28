package dataDrivenFramWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidAndInvalidData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-abhi/login.do");
		Flib flib = new Flib();
		int rc=flib.rowCount("./data/ActiTimeTestData.xlsx","invalid");
		
		for (int i=1;i<=rc;i++) {
			
		}
		

	}

}
