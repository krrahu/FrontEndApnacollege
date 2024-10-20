package Section12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.qaclickacademy.com/");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// Req 1: to get count of links on page
		System.out.println(driver.findElements(By.tagName("a")).size()); 
		// Req 2: to get total count of footer section of any  page
		// Step1 :first create a sub driver  and then take  the count as shown below (i.e limiting web driver Scope)
	WebElement subDriver=driver.findElement(By.id("gf-BIG"));
System.out.println(subDriver.findElements(By.tagName("a")).size());
// Re 3: cal the total count on column first


WebElement coloumndriver=subDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

System.out.println(coloumndriver.findElements(By.tagName("a")).size());

// Req 4 : click on each link in the column and check if page is opening or not 
for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {
	String openNewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(openNewTab);
	Thread.sleep(5000);
}
	
	// get all windows count and print the title
Set <String >count=driver.getWindowHandles();
Iterator <String> it=count.iterator();
//hasNext() will check if value is present then move by using next()
while (it.hasNext())
{
	
driver.switchTo().window(it.next());
System.out.println(driver.getTitle());
	
}
//driver.navigate().back(); 
}


}
