package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {

	public static void main(String[] args) throws InterruptedException {
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://desktop-abhi/login.do ");
     Thread.sleep(4000);
     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
     
  //   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
     
     driver.findElement(By.xpath("//a[.='Login']")).click();  //case 2
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[.='View Time-Track']")).click();//case 2
     driver.findElement(By.xpath("//select[@name='usersSelector.selectedUser']")).click();
     driver.findElement(By.xpath("//td[@id='cpSelector.cpButton.contentsContainer']")).click(); 
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//a[@href='/user/submit_my_tt.do?resetDate=true']")).click(); 
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//span[.='Help & Support']")).click(); //case 2

     driver.findElement(By.xpath("//a[@id='profile-link']")).click(); 
     
     driver.findElement(By.xpath("//td[@id='cpSelector.cpButton.contentsContainer']")).click(); 

     driver.findElement(By.xpath("//input[@name='searchTasks']")).click(); 

     driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click(); 

     driver.findElement(By.xpath("//input[@name='visiableFilterString']")).click(); 

     driver.findElement(By.xpath("//td[@id='ext-gen21']")).click(); 

     driver.findElement(By.xpath("//td[@id='userRightCell_3_9']")).click(); 
     
     driver.findElement(By.xpath("//a[.='Maske, Rushi (Manager)']")).click(); //case 2
     driver.findElement(By.xpath("//a[.='System, Administrator (admin)']")).click(); //case 2
     driver.findElement(By.xpath("//a[.='Gandhi, Rahul (Test Engineer)']")).click(); //case 2
     driver.findElement(By.xpath("//a[.='Create new tasks']")).click(); //case 2
     driver.findElement(By.xpath("//span[.='actiTIME for iPhone']")).click(); //case 2
     driver.findElement(By.xpath("//a[.='Logout']")).click(); //case 2//case 2
     driver.findElement(By.xpath("//a[@href='/user/submit_tt.do?dateStr=20230107']")).click(); 
     driver.findElement(By.xpath("//img[@src='/img/default/calendar/prev_month.gif?hash=1692528820']")).click(); 
     driver.findElement(By.xpath("//input[@id='SubmitTTButton']")).click(); 
     driver.findElement(By.xpath("//span[.='Insert existing tasks']")).click(); //case 2
     
     driver.findElement(By.xpath("// a[.='License for using this software']")).click(); //case 2
     driver.findElement(By.xpath("// a[.='License for using this software']")).click(); //case 2
     driver.findElement(By.xpath("//input[@name='remember']")).click(); 
     driver.findElement(By.xpath("//label[.='Keep me logged in unless I log out']")).click(); //case 2
     driver.findElement(By.xpath("//a[.='Login']")).click(); //case 2
     driver.findElement(By.xpath("//a[.='Actimind Inc.']")).click(); //case 2

     
     
    // driver.findElement(By.xpath("//a[.='Open Tasks']")).click();  //case 2
     
	}

}
