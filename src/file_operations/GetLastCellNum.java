package file_operations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastCellNum {

	public static int GetLastCellNumExcel(String filepath, String Sheetname,int Ri) {
		File f=new File(filepath);
		int LastCellNum=0;
		try{
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet(Sheetname);
		Row r=st.getRow(Ri);
		LastCellNum=r.getLastCellNum();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return LastCellNum;
	}

}
