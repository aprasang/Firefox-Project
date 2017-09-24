package file_operations;

public class ReadDataFromExcel {

	public static void main(String[] args) {
		String filepath="D:\\D Backup\\D FOlder\\Selenium Samples\\Data.xlsx";
		String sheetName="Sheet1";
		String Value=null;
		int rowNum=GetLastRowNum.GetLastRowNumExcel(filepath,sheetName);
		//int cellNum1=GetLastCellNum.GetLastCellNumExcel(filepath, sheetName, 0);
		//System.out.println("Rows "+rowNum);
		//System.out.println("Cells "+cellNum1);
		
		
		for(int r=0;r<=rowNum;r++)
		{
			int cellNum=GetLastCellNum.GetLastCellNumExcel(filepath, sheetName, r);
			//System.out.println(cellNum);
			for (int c=0;c<cellNum;c++)
			{
				Value= GetData_Excel.FromExcel(filepath, sheetName, r, c);
				System.out.print(Value.toString());
				
			}
			System.out.println();
		}

	}

}
