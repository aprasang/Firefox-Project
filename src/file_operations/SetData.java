package file_operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class SetData {

	public static void main(String[] args) {
		toProperties("D:\\D Backup\\D FOlder\\Selenium Samples\\Sample_file1.properties", "color", "fair");
	}

	public static void toProperties(String filepath, String Key, String Value) {
		File f = new File(filepath);
		try {
			FileInputStream fis = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			prop.setProperty(Key, Value);
			FileOutputStream fos = new FileOutputStream(f);

			prop.store(fos, "insert");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
