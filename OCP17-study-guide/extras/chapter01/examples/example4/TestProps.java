import java.util.Properties;

public class TestProps {

	public static void main(String[] args) {
		
		Properties props = System.getProperties();
		String myProp = System.getProperty("myProp");
		System.out.println("propertyValue : " + myProp);

		System.out.println(props);
	}
}
