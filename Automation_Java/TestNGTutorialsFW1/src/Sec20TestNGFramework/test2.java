package Sec20TestNGFramework;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	
	 @BeforeClass
	  public void BFclass() 
	    
	    {
	  	  System.out.println(" run before class");
	    
	    }@BeforeMethod
	
	 public void BFmethod() 
	   
	   {
	 	  System.out.println(" execute before method");
	   
	   }
	@AfterMethod
	
	 public void AFmethod() 
	   
	   {
	 	  System.out.println(" execute after method");
	   
	   }
	
  @Test 
  public void Demo2() 
	  
	  {
		  System.out.println("first test case");
	  
	  }
	  
  @BeforeTest
  public void before() 
  
  {
	  System.out.println("strat from ");
  
  }
  
  @AfterSuite
public void AFsuite() 
  
  {
	  System.out.println("i am no 1 from last");
  
  }
  @BeforeSuite
  public void BFsuite() 
    
    {
  	  System.out.println("i am no 1");
    
    }
  
  @AfterClass
  public void AFclass() 
    
    {
  	  System.out.println(" run after class");
    
    }
  
  @AfterTest
  public void lastexecution() 
  
  {
	  System.out.println(" last execution");
  
  }
  
  

}
