package Sec20TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Automobile {
	
	 @Test (groups= {"smoke"})
	  public void ASportsCar() 
		  
		  {
		
			  System.out.println("A-->ferrai manufatures sports car");
		  
		  }
	 @Test (enabled=false)
	 public void BFamilyCar() 
	  
	  {
		
		  System.out.println("B-->Maritu manufatures family car");
	  
	  }
	 
	
	 @Parameters({"URL"})
	 @Test
	 public void CTruck(String urlname) 
	  
	  {
		
		  System.out.println("C-->Ashok manufatures Trucks ");
		  System.out.println(" calling url value from Automobile class:"+urlname);
	  
	  }
	 @Test(dependsOnMethods= {"ASportsCar","CTruck"})
	 public void DSportsBike() 
	  
	  {
		
		  System.out.println("D-->Suzuki manufatures sports Bike ");
	  
	  }
	 @Test 
	 public void Edummy() 
	  
	  {
		
		  System.out.println("E-->purposefully failed this test case for for listeners class understing");
		  Assert.assertTrue(false);
	  
	  }
		  
		  

}
