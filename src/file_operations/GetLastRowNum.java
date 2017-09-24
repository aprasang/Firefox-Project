package file_operations;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;

public class GetLastRowNum {

	public static int GetLastRowNumExcel(String filepath, String Sheetname) {
		File f=new File(filepath);
		int LastRowNum=0;
		try{
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet(Sheetname);
		 LastRowNum=st.getLastRowNum();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return LastRowNum;
	}
}
