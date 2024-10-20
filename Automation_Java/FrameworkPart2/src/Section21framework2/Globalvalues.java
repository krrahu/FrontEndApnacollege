package Section21framework2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Globalvalues 
{
	
	/*
	 * @Test public void variables() throws IOException
	 */
	
	public static void main(String[] args) throws IOException
	{
		Properties prop= new Properties();
		// to read the data from file
		FileInputStream fis= new FileInputStream("C:\\Automation_Java\\CoreJavaconcepts\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("URL"));
		prop.setProperty("browser", "firfox");
		System.out.println(prop.getProperty("browser"));
		
		// to write the data in  file
		FileOutputStream fos= new FileOutputStream("C:\\Automation_Java\\CoreJavaconcepts\\src\\data.properties");
		prop.store(fos, null);
		
		
	}
	

}
