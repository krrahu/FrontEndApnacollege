import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Code_E2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\geckodriver.exe");
		
		
		// create browser object
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.codeproject.com/"); 
		driver.findElement(By.xpath("//*[@id=\'ctl00_STM\']/div/div/div[3]/span/span/a")).click();
		driver.findElement(By.cssSelector("#ctl00_MC_MemberLogOn_CurrentEmail")).sendKeys("rahul.baliyase46@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='ctl00_MC_MemberLogOn_CurrentPassword']")).sendKeys("U11et030@15");
	
		driver.findElement(By.cssSelector("input[id='ctl00_MC_MemberLogOn_SignInButton']")).click();
	
		//driver.findElement(By.cssSelector("a[href*='ctl00_STM']")).click();
		//driver.findElement(By.cssSelector("#ctl00_STM")).click();;

		
		//--->//tagName[contains(@attribute,'value')]  - xpath regular expression
		//---->//tagName[@attribute='value']  - xpath syntax

		//--->tagName[Atrribute*='value'] - Css regular expression
		//---->tagName[attribute='value']  -CSS  tagName#id- CSS   tagname.classname- CSS
	
		//========regular expression=========
		//driver.findElement(By.xpath("//input[contains(@class,'search']")).sendKeys("java");
		driver.findElement(By.cssSelector("input[class*='search']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[@class='search subdue']")).sendKeys("Testing");
		
	
	}

}
