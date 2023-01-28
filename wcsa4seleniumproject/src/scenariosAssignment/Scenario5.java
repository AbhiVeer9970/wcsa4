package scenariosAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(
				"https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiAkrWdBhBkEiwAZ9cdcCD9JHMYBmLt8ujxEJw-tL8E4IelJfzFw25E36tREqi262sJqKzg-BoClk0QAvD_BwE");
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		Thread.sleep(4000);
		WebElement ring = driver.findElement(By.xpath("//a[.='Rings '] "));
		act.moveToElement(ring).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.=' Popular ']")).click();
		Thread.sleep(3000);

		List<WebElement> defaultPrize = driver.findElements(By.xpath("//span[@class='new-price']"));
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		List<WebElement> sortedPrize = driver.findElements(By.xpath("//span[@class='new-price']"));
		for(int i=0;i<sortedPrize.size();i++)
		{
			WebElement opts = sortedPrize.get(i);
			String value = opts.getText();
			System.out.println(value);
			
		}
         Thread.sleep(5000);
		 driver.quit();

	}

}
