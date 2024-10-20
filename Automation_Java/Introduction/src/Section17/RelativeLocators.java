package Section17;
// this funtionality is only available for selenium 4.0 version on wards
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static  org.openqa.selenium.support.locators.RelativeLocators.withTagName;

public class RelativeLocators 
{
	
	
	public static void main(String[] args, By withTagName) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	
		
		// create browser object
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
	WebElement nameEditbox=driver.findElement(By.cssSelector("[name='name']"));
	
	//driver.findElement(withTagName("label").above(nameEditBox)).getText());
	// for css [for='dateofBirth']  for xpath --> //label[@for='dateofBirth']
	WebElement DOB=driver.findElement(By.cssSelector("[for='dateofBirth']"));
	//driver.findElement(withTagName("label").below(DOB)).sendkaey();
	
	WebElement icecreamlabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	//driver.findElement(withTagName("label").toleftof(icecreamlabel)).click();
	
	WebElement rd= driver.findElement(By.id("inlineRadio1"));
	//driver.findElement(withTagName("label").toRightof(rd)).getText();
	

}
}