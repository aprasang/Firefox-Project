package sampleprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Property_Class {

	
	public static void main(String[] args)
	{
		//reading a file
	/*	File f = new File("D:\\D Backup\\D FOlder\\Selenium Samples\\Sample_file.txt");
		try{			
		
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.get("key"));
		System.out.println(prop.get("name"));
		System.out.println(prop.get("surname"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		} */
		
		//writing a file
		
		File f=new File("D:\\D Backup\\D FOlder\\Selenium Samples\\Sample_file1.properties");
		try
		{
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		
		prop.setProperty("address2", "vibgyou");
		prop.setProperty("city", "Bangalore");
		
		FileOutputStream fos=new FileOutputStream(f);
		prop.store(fos, "comments");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
