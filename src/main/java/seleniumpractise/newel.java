package seleniumpractise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class newel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis = new FileInputStream("C:\\Users\\prasa\\OneDrive\\Documents\\vinod.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    String data = wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
    System.out.println(data);
    
   
	}

	
}
