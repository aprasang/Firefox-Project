package file_operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Sample {

	public static void main(String[] args) {

		// getting data form excel
		/*
		 * File f = new File(
		 * "D:\\D Backup\\D FOlder\\Selenium Samples\\Data.xlsx"); try {
		 * FileInputStream fis = new FileInputStream(f); Workbook wb =
		 * WorkbookFactory.create(fis); Sheet st = wb.getSheet("Sheet1"); Row r
		 * = st.getRow(0); Cell c = r.getCell(1);
		 * System.out.println(c.toString());
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
		// Writing data to EXcel

		File f = new File("D:\\D Backup\\D FOlder\\Selenium Samples\\Data.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet("Sheet1");
			Row r = st.getRow(0);
			Cell c = r.getCell(1);
			c.setCellValue("Noble");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
