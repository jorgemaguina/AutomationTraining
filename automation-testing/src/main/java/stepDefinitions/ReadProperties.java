package stepDefinitions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ReadProperties {
	
	private Properties prop = new Properties();
	
	public void main(String[] args) {
		
		readPropertiesFile();
		
	}
	
	
	public void readPropertiesFile() {

        InputStream in = this.getClass().getResourceAsStream("/config.properties");
        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
	
	public  String getPropertyValue(String key){
	    return prop.getProperty(key);
	 }
	
	public  Long getPropertyTimeout(String key){
		
		Long timeout= Long.parseLong(prop.getProperty(key));
	    return timeout;
	 }
	

	


}
