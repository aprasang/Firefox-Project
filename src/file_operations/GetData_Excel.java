package file_operations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData_Excel {

	public static void main(String[] args) {
		String Value = FromExcel("D:\\D Backup\\D FOlder\\Selenium Samples\\Data.xlsx", "Sheet2", 2, 0);
		System.out.println(Value);
	}

	public static String FromExcel(String filepath, String sheetName, int Ri, int Ci) {
		File f = new File(filepath);
		String Value = null;
		try {
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(Ri);
			Cell c = r.getCell(Ci);
			Value = c.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Value;
	}
}
