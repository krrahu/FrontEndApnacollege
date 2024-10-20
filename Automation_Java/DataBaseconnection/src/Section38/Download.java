package Section38;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Download {


		public static void main(String[] args) throws IOException, InterruptedException {
			String dowloadpath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\DataBaseconnection\\Driver\\chromedriver.exe");
			HashMap<String,Object> chromepref=new HashMap<String,Object>();
			chromepref.put("profile.default_content_settings.popups", 0);
			chromepref.put("download.default_directory", dowloadpath);
 			
			ChromeOptions options=new ChromeOptions();
			options.setExperimentalOption("file", chromepref);
	WebDriver driver = new ChromeDriver(options);

	driver.get("https://smallpdf.com/word-to-pdf");
	driver.findElement(By.xpath("//*[text() = 'Choose Files']")).click();
	Thread.sleep(4000);
	Runtime.getRuntime().exec("C:\\Users\\r847805\\Desktop\\Java_Selenium\\Autoit\\fileupload.exe");
	Thread.sleep(6000);
	// wait untill download button becomes visible
	WebDriverWait wait=new WebDriverWait(driver, 0);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = 'Download']")));
	// click ondownload
	driver.findElement(By.xpath("//*[text() = 'Download']")).click();

	//File f = new File("C:\\Users\\r847805\\Downloads\\name.zip");
		File f = new File(dowloadpath+"/converted.zip");
	
	if (f.exists()) 
	{
		System.out.println("file is present");
	//	if we wants to delete the file 
		//if (f.delete()) 
		//{
		//	System.out.println("file is deleted");	
		//}
		
	}

		}

	}
