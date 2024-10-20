package Section15;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchFilter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("rice");
		List<WebElement>veglist=driver.findElements(By.xpath("//tr/td[1]"));
		//
		List<WebElement>filterlist=veglist.stream().filter(v->v.getText().contains("Rice")).collect(Collectors.toList());
		// 1 result
		Assert.assertEquals(veglist.size(), filterlist.size());
		System.out.println("test is passed");
		
		
		
		

	}

}
