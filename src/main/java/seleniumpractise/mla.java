package seleniumpractise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class mla {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis = new FileInputStream("C:\\Users\\prasa\\OneDrive\\Documents\\Book1.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
    System.out.println(data);
	}

	
}
