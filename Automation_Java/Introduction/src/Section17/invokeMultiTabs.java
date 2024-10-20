package Section17;

import java.io.File;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class invokeMultiTabs {
	
	public static void main(String[] args, By withTagName) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//driver.switchTo().newWindow(WindowType.TAB);
		Set<String>handles=driver.getWindowHandles();
		/*
		 * Iterator <String>it =handles.iterator(); String parentwiondow= it.next();
		 * String childwiondow= it.next(); driver.switchTo().window(childwiondow);
		 * driver.get(""); String
		 * coursename=driver.findElements(By.cssSelector("").get(1).getText();
		 * driver.switchTo().window(parentwiondow);
		 * driver.findElement(By.cssSelector("")).sendKeys(coursename);
		 *  
		 //======= screenshot for webelement only not entire page File
		  
		 
		 * file=coursename.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(srcFile,
		 * destFile);
		 */
	// find the dimension height and width
		
		
		
}}
