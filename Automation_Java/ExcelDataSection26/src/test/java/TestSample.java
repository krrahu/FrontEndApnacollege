import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws FileNotFoundException {
	
		Datadriven d = new Datadriven();
	ArrayList<String> s=	d.getdata("Add profile");

	System.out.println(s.get(0));
	System.out.println(s.get(1));
	System.out.println(s.get(2));
	System.out.println(s.get(3));

	}

}
