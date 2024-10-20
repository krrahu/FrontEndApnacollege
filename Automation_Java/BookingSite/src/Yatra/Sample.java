package Yatra;

public class Sample
{
	public static void num() //method 
	{
		
		return;
	}
	
	public static class test // inner class
	{
		public int Add () //Add method 
		{
			int a = 1;
			int b= 2;
			int c =a+b;
			return c;
		}
		
	}
	public static void main(String[] args) // main method
	{

    test t = new test();
    int result=t.Add();
    System.out.println("total sum:" + result);
    }
}
