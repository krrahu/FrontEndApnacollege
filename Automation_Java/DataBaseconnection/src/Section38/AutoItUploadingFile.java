package Section38;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoItUploadingFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\DataBaseconnection\\Driver\\chromedriver.exe");
		//
WebDriver driver = new ChromeDriver();

driver.get("https://smallpdf.com/word-to-pdf");
driver.findElement(By.xpath("//*[text() = 'Choose Files']")).click();
Thread.sleep(4000);
Runtime.getRuntime().exec("C:\\Users\\r847805\\Desktop\\Java_Selenium\\Autoit\\fileupload.exe");
Thread.sleep(6000);



}}
