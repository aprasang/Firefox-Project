package sampleprograms;

import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;

public class File_Sample {

	public static void main(String[] args) {
		File f = new File("D:\\D Backup\\D FOlder\\Selenium Samples\\Sample_file.txt");

		// To check for file access
		/*
		 * System.out.println(f.exists()); System.out.println("Read " +
		 * f.canRead()); System.out.println("write " + f.canWrite());
		 * System.out.println("Execute " + f.canExecute());
		 */

		// To create a new file
		/*
		 * try { f.createNewFile(); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// To read a file
		/*
		 * try { FileInputStream fis = new FileInputStream(f);
		 * System.out.println(fis.read());
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */

		// To write a data to file

		try {
			FileOutputStream fos = new FileOutputStream(f, true);
			fos.write(97);
			fos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
