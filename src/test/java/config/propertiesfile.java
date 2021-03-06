/*package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertiesfile {
	
	static Properties prop = new Properties();  // created object for class Properties

	public static void main(String[] args) {

		getproperties();
		setProperties();
		getproperties();

	}

	public static void getproperties()
	
	{
		try {				
		
			InputStream input = new FileInputStream("C:\\Users\\Pooja Bajaj\\eclipse-workspace\\appiumdemoproject\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public static void setProperties()
	
	{
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\Pooja Bajaj\\eclipse-workspace\\appiumdemoproject\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
}
*/