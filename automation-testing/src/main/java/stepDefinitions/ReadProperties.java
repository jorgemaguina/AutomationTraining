package stepDefinitions;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;


public class ReadProperties {
	
	static Properties prop = new Properties();
	
	public static void main (String [] args) {
		
		readPropertiesFile();
		
	}
	
	
	public static void readPropertiesFile() {
	
		
			try {
				InputStream input = new FileInputStream ("C:/Users/mariel.lopez/Documents/AutomationTraining/Task4/automation-testing/src/main/resources/config.properties");
				prop.load(input);
				
			
				
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	}
	
	public static String getPropertyValue(String key){
	    return prop.getProperty(key);
	 }
	
	public static Long getPropertyTimeout(String key){
		
		Long timeout= Long.parseLong(prop.getProperty(key));
	    return timeout;
	 }
	

	


}
