package file_operations;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GetData {

	public static void main(String[] args) {
		String Value = fromProperties("D:\\D Backup\\D FOlder\\Selenium Samples\\Sample_file1.properties", "address1");
		System.out.println(Value);

	}

	public static String fromProperties(String filepath, String Key) {
		File f = new File(filepath);
		String value = null;
		try {
			FileInputStream fis = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			value = (String) prop.get(Key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
}
