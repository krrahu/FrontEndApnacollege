package Alpha;
import org.apache.logging.log4j.*;


public class Demo {
	
	
//LogManager is an api and getLogger is a function
	private static Logger logs=LogManager.getLogger(Demo.class.getName());
	// selenium,appium, restAPIas

	public static void main(String[] args) {
		logs.debug("i am debugging");
		logs.info("object is present");
		logs.error("object is not  present");
		logs.fatal("this is fatal");

	}

}
