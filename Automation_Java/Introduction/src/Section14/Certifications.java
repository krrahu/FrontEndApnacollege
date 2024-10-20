package Section14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Certifications {
	public static void main(String[] args) throws InterruptedException {
		
		// SSL cretificate
		// desired capabilities
		// generak chrome profile
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		//below to your local browser
		ChromeOptions chrome=new ChromeOptions();
		chrome.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(chrome);

}}
