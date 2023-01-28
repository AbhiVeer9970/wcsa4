package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatnikeLoginPage {

	public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.nike.com/sg/member/profile/login?continueUrl=https://www.nike.com/sg/men");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Abhi@gmail.com");
          //  Thread.sleep(3000);

            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Pass@123");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
            Thread.sleep(3000);
  
         //   driver.quit();
	}

}
