package file_operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SetData_Excel {

	public static void main(String[] args) {
		toExcel("D:\\D Backup\\D FOlder\\Selenium Samples\\Data.xlsx", "Sheet1", 0, 0, "Google");
	}

	public static void toExcel(String filepath, String sheetname, int Ri, int Ci, String CellValue) {
		File f = new File(filepath);
		try {
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetname);
			Row r = st.getRow(Ri);
			Cell c = r.getCell(Ci);
			c.setCellValue(CellValue);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
