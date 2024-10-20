import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// setting the path for driver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\r847805\\Desktop\\Java_Selenium\\Softwares\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		
		// create browser object
		WebDriver driver = new ChromeDriver();
		//driver.get("https://as.allscripts.com/");
	driver.get("https://www.google.com");
	String t= driver.getTitle();
System.out.println(t);
System.out.println(driver.getCurrentUrl());// 
//System.out.println(driver.getPageSource());//

driver.navigate().to("https://www.yahoo.com");
driver.get("https://www.google.com");
driver.navigate().back();
driver.navigate().forward();
driver.close(); // close the current browser
driver.quit();// close the all windows of browser


	}

}
