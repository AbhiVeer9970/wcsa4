package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Youtube", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		List<WebElement> Suggestions = driver
				.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
		Thread.sleep(3000);

		for (int i = 0; i < Suggestions.size(); i++) {
			WebElement options = Suggestions.get(i);
			String opt = options.getText();
			Thread.sleep(3000);
			System.out.println(opt);
			driver.quit();	

		}

	}

}
