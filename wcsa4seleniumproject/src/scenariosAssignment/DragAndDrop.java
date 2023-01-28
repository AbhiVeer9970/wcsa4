package scenariosAssignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    driver.get("https://jqueryui.com/droppable/");
    Thread.sleep(4000);
    Actions act = new Actions(driver);
    
    Thread.sleep(5000);
    WebElement source = driver.findElement(By.id("draggable"));
    WebElement target = driver.findElement(By.id("draggable"));
   
   // Thread.sleep(6000);
    act.dragAndDrop(source, target).perform();
    
   // Thread.sleep(6000);
     driver.quit();
	}

}
