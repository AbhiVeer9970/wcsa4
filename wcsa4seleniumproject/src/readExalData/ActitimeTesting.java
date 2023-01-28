package readExalData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-abhi/login.do");

		Thread.sleep(2000);
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("valid");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys(data);
		//

		FileInputStream fis1 = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet1 = wb1.getSheet("valid");
		Row row1 = sheet1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String data1 = cell1.getStringCellValue();
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(data1);
        
		driver.findElement(By.id("loginButton")).click();
	}

}
