package Beta;
import org.apache.logging.log4j.*;


public class Demo1 {
	
	
//LogManager is an api and getLogger is a function
	private static Logger logs=LogManager.getLogger(Demo1.class.getName());
	

	public static void main(String[] args) 
	{
		logs.debug("i am debugging");
		logs.info("object is present");
		logs.error("object is not  present");
		logs.fatal("this is fatal");

	}

}
