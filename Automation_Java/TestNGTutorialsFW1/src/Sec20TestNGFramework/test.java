package Sec20TestNGFramework;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class test {
	
	
	  @Test 
	  
	  public void Demo() 
	  
	  {
		  System.out.println("first test case");
	  
	  }
	  
	  
	 
@Test (groups= {"smoke"})
public static void  method1()
{
	ArrayList<String> al = new ArrayList<String>();
	al.add("rahul");
	al.add("kumar");
	al.add("Tester");
	al.add("AutomationTester");
	int count=0;
	
	for (int i = 0; i <al.size(); i++) 
	{
		String names=al.get(i);
		if (names.startsWith("A"))
				{
			count++;
		
				}
		System.out.println("No of people whose name start with A :" +count);
	}
	System.out.println("No of people whose name start with A :" +count);
	  System.out.println("second  test case");
}}