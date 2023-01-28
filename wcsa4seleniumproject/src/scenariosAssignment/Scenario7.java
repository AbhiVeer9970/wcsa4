package scenariosAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(
				"https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiAkrWdBhBkEiwAZ9cdcCD9JHMYBmLt8ujxEJw-tL8E4IelJfzFw25E36tREqi262sJqKzg-BoClk0QAvD_BwE");
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		WebElement allOptions = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Thread.sleep(4000);
		act.moveToElement(allOptions).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		WebElement oneOpt = driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]"));
		Thread.sleep(4000);
		act.moveToElement(oneOpt);
		driver.findElement(By.xpath("(//a[.='View Details >>'])[1]")).click();
		//driver.findElement(By.xpath("//span[.=' Select Size ']")).click();
		//driver.findElement(By.xpath("//span[.='2-8(2 8/16\")']")).click();
		driver.findElement(By.id("buy-now")).click();
	}

}
