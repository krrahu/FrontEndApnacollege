package Sec20TestNGFramework;

import javax.swing.Spring;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Person {
	
	@Parameters({"URL","UN"})
	 @Test 
	  public void Asian(String urlname,String username) 
		  
		  {
		
			  System.out.println("Asians are mainly belongs  brown peoples");
			  System.out.println(" calling url value from person class:"+urlname+ username);
		  
		  }
	 @Test //(enabled=false)
	 public void African() 
	  
	  {
		
		  System.out.println(" African are mainly Black in colour");
	  
	  }
	 @Test
	 public void Americian() 
	  
	  {
		
		  System.out.println("Americian are full of African,asian,white peoples ");
	  
	  }
	 @Test
	 public void Europians() 
	  
	  {
		
		  System.out.println("Europians are mostly white in colour");
	  
	  }
	 @Test (dataProvider="GetData")
	 public void logindetails(String un,String pwd) 
	  
	  {
		
		  System.out.println("using user and password from Data provider anotation:"+un + pwd);
	  
	  }
	 
	 @DataProvider
	 public Object GetData() 
	  
	  {
		 // ist combination --> username and password for good credit history
		 //2nd combination--> username and password for no credit history
		//2nd combination--> username and password for fraud credit history
		 
		 Object [][] data=new Object[3][2];
		 // Ist set
		 data[0][0]="testgood";
		 data[0][1]="PWD";
		 //
		 // 2nd set
		 data[1][0]="testNo";
		 data[1][1]="PWD12";
		 // 3rd set
		 data[2][0]="testfraud";
		 data[2][1]="PWD123";
		 
		 return data;
		  
	  
	  }
	 
		  

}
