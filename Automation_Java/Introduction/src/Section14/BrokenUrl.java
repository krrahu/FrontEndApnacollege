package Section14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenUrl {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//SoftAssert a =new SoftAssert();
        //Step 1 - IS to get all urls tied up to the links using Selenium

        //  Java methods will call URL's and gets you the status code

        //if status code >400 then that url is not working-> link which tied to url is broken

 
		//================== for checking one URL ======
		
        //a[href*="soapui"]'
//  String url=driver.findElement(By.cssSelector("a[href*='SoapUI']")).getAttribute("href");
  // we are calling open connection method of url class (that's why we arecreating object of URL class) and cascading it
 // when we call openconnection() the return type is HttpURLConnection
// HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
// con.setRequestMethod("HEAD"); con.connect(); int
 //response=con.getResponseCode(); System.out.println(response);


		
		
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement link : links)
		{
			String url =link.getAttribute("href");
			HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int response=con.getResponseCode();
			System.out.println(response);
			
			// one way
			if (response>400)
			{
				System.out.println("The link text with link"+link.getText()+"is broken with code"+response);
				Assert.assertTrue(false);
				
			}
		
			
			// 2nd Way
	     /*     a.assertTrue(response<400, "The link with Text"+link.getText()+" is broken with code" +response);
	      }
	      a.assertAll();*/
		}
		
		
		
		
		driver.quit();

	}}


