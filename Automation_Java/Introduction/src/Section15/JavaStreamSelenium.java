package Section15;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaStreamSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		driver.findElement(By.xpath("//tr/th[1]"));
		
		// capture all web elements into a list
		List<WebElement> elementlist= driver.findElements(By.xpath("//tr/th[1]"));
		
		//capture text of all web elements into a new i.e original list
		List<String> newlist=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		// sort the new  list
		List<String> sortedlist=	newlist.stream().sorted().collect(Collectors.toList());
		// compare  new i.e original list vs sorted list
		Assert.assertTrue(newlist.equals(sortedlist));
		
		//scan the name column with get text-->Beans-->print the price of rice
	//	List<String>price=(List<String>) elementlist.stream().filter(s->s.getText().contains("Beans"))
		//		.map(s->getPriceVeggie(s)).collect(Collectors.toList());
	//price.forEach(a->System.out.println(a));
	
	
	// if item is not present in first page goto next page and verfiy the price of item by using do while loop
		/*
		 * do { List<WebElement> rowslist= driver.findElements(By.xpath("//tr/th[1]"));
		 * List<String>price=rowslist.stream().filter(s->s.getText().contains("Rice")).
		 * map(s->getPriceVeggie(s)).collect(Collectors.toList());
		 * price.forEach(a->System.out.println(a));
		 * 
		 * if (price.size()<1) {
		 * driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		 * 
		 * }
		 * 
		 * } while (price.size()<1);
		 * 
		 * 
		 * 
		 * private static String getPriceVeggie(WebElement s) { String
		 * pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		 * return pricevalue; }
		 */		

}}
