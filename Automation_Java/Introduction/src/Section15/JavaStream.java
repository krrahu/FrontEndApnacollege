package Section15;


import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStream
{

		
	@Test
	public static void  method1()
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("rahul");
		al.add("kumar");
		al.add("Tester");
		int count=0;
		
		for (int i = 0; i <al.size(); i++) 
		{
			String names=al.get(i);
			if (names.startsWith("A"))
					{
				count++;
			
					}
			//System.out.println("No of people whose name start with A :" +count);
		}
		System.out.println("No of people whose name start with A :" +count);
	}
	
// upper code can be written in 3 ways just for optimization of code	
	 // @Test 
	  // 1st way 
	  /*public static void method2() {
		  ArrayList<String> al = new  ArrayList<String>(); 
		  al.add("Rahul"); 
		  al.add("kumar"); 
		  al.add("Tester");
		  // first it will Store all string values in stream() then from list it will filter the only  names whose first letter start with R then it will give count
	 long total= al.stream().filter(s->s.startsWith("R")).count();
	  System.out.println(total);
	  }*/
	  
	  
	  //====================== 2nd way============
	  
	/* long d = Stream.of("test","developer","QA","Bussiness").filter(s->
	 {
		 s.startsWith("R");
			 return true;
	 }).count();
	
	// System.out.println(d);*/
	 
	 
	 // ==========3rd way===================
	 //Print all the name of Array list

	//al.stream().filter(s->s.length()>4).forEach(s->System.out.println(d));
	//names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(d));
	 	 
}

	

//}
