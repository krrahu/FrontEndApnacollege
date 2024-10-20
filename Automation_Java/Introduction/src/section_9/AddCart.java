package section_9;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		// create browser object
		WebDriver driver = new ChromeDriver();
		int j=0;
String [] veg= {"Cucumber","Cauliflower","Brocolli",""};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		// --->RXpath --> //h4[@class='product-name']
		// css--> h4.product-name
		
		List<WebElement>allProductnames=driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0; i <allProductnames.size(); i++) 
		{
			
			String name=allProductnames.get(i).getText();
			// need to format the product name i.e Brocolli - 1 Kg we need Cucumber only not Cucumber - 1 kg to this first split the veg name and quantity in 2 parts  then trim the white at 0 index i.e veg name 
			String[] name1=allProductnames.get(i).getText().split("-");
			String formatname=name1[0].trim();
			
			// convert array into array list for easy search and check whether the name u extracted is present in array list or not
			List allveg=Arrays.asList(veg);
			
			if(allveg.contains(formatname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); // don't use text it always changed used attributes values
				
				if (j==veg.length) // instead of j==3 use dynamic j==veh.length i.e length of veg array
				{
					break;
					
				}
			}
//			else 
//			{
//				System.err.println("not present in list");
//			}
			
		}
		
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		//driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		driver.findElement(By.cssSelector("button[type='button']")).click();
		
	}

}





/*
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe"); //
 * create browser object WebDriver driver = new ChromeDriver();
 * 
 * driver.get("https://rahulshettyacademy.com/seleniumPractise/"); // --->RXpath
 * --> //h4[@class='product-name'] // css--> h4.product-name
 * 
 * List<WebElement>allProductnames=driver.findElements(By.cssSelector(
 * "h4.product-name"));
 * 
 * for (int i = 0; i <allProductnames.size(); i++) {
 * 
 * String name=allProductnames.get(i).getText();
 * 
 * if(name.contains("Cucumber")) {
 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(
 * ); break; }
 */
