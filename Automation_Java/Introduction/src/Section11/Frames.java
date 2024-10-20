package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		// to get frame count
		System.out.println(driver.findElements(By.tagName("iframe")).size()); 
		//driver.switchTo().frame(1); // by index based
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	Actions a=new Actions(driver);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	a.dragAndDrop(source, target).build().perform();
	// to come out the frame
	driver.switchTo().defaultContent();	
}}
