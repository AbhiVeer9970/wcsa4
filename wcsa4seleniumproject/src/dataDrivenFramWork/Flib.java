package dataDrivenFramWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String actiTimeValid(String fileName, String sheetname, int rowcount, int cellcount)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;

	}

	public int rowCount(String exalPath, String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(exalPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;
	}

	public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(data);
		wb.write(fos);
	}
	public static String readPropertyData(String propPath,String keyValue) throws FileNotFoundException 
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop= new Properties();
		String data = prop.getProperty(keyValue);
		return data;
	}
}
