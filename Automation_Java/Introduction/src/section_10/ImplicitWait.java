package section_10;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		// Explicit wait
		//WebDriverWait w= new WebDriverWait(driver, 6);
String [] veg= {"Cucumber","Cauliflower","Brocolli",""};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,veg); // simply we are calling add items method
		
		
	}

	/*
	 * String test="gkj";
	 * addItems(driver,test);
	 * public static void addItems(WebDriver driver,String test) {
	 * 
	 * }
	 */
	
public static void addItems(WebDriver driver,String []veg) //creating a mthod 
	
   {
	int j=0;
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
}
	//driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	//driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
	driver.findElement(By.cssSelector("button[type='button']")).click();
	WebDriverWait w1= new WebDriverWait(driver, 6);
	w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
	driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy"); // CSS-->input[class='promoCode']
	driver.findElement(By.cssSelector("button.promoBtn")).click();  // when we use class name
	
	// Explicit wait
	WebDriverWait w= new WebDriverWait(driver, 6);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	
	
	
}}