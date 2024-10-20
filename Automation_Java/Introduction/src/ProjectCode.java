import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectCode {

	public static void main(String[] args) {
		// setting the path for driver
		
			System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\geckodriver.exe");
			
			
			// create browser object
			WebDriver driver = new ChromeDriver();
	//		WebDriver driver = new FirefoxDriver();
			
	
			driver.get("https://www.codeproject.com/"); 
			
	
					
			driver.findElement(By.xpath("//*[@id=\'ctl00_STM\']/div/div/div[3]/span/span/a")).click();
			
			
			driver.findElement(By.cssSelector("#ctl00_MC_MemberLogOn_CurrentEmail")).sendKeys("rahul.baliyase46@gmail.com");
			
			//driver.findElement(By.id("ctl00_MC_MemberLogOn_CurrentEmail")).sendKeys("rahul.baliyase46@gmail.com");
		
			
			driver.findElement(By.name("ctl00$MC$MemberLogOn$CurrentPassword")).sendKeys("U11et030@15");
			
			driver.findElement(By.id("ctl00_MC_MemberLogOn_SignInButton")).click();
			
			// if UN or PWD is wrong then get the validaion msge and print in console
			//System.out.println(driver.findElement(By.cssSelector("#ctl00_MC_MemberLogOn_LogonError")).getText());
			
			// enter some text value in search text field [ by customize xpath] 
			driver.findElement(By.xpath("//input[@class='search subdue']")).sendKeys("Testing");
			
			// click on search button [ by customize xpath]
			
			driver.findElement(By.xpath("//input[@src='https://codeproject.freetls.fastly.net/images/search.gif']")).click();
			
			//tap on sanity testing link
			//driver.findElement(By.xpath("//*[@id=\'ctl00_MC_Results_ctl00_DocTitle\']")).click();
			
			driver.findElement(By.cssSelector("[id='ctl00_MC_Results_ctl00_DocTitle']")).click();
			
			
			//  Regular expression:
				
			// close the browser
			
		//driver.quit();
		//System.out.println("browser is closed");	
		

	}

}
