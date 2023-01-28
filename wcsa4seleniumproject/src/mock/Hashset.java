package mock;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hashset {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/91997/OneDrive/Desktop/html%20components/Multipal%20_select_dd.html");
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropDownElement);
		HashSet<String> s = new HashSet<String>();
		//TreeSet<String> s = new TreeSet<String>();
		List<WebElement> allOpt = sel.getOptions();
		for (int i = 1; i < allOpt.size(); i++) {
			WebElement opt = allOpt.get(i);
			String value = opt.getText();
			s.add(value);
		}

		for (String opts : s) {
			System.out.println(opts);
		}

	}
}