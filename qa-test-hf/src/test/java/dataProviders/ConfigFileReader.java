package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class ConfigFileReader
{
	private Properties properties;
	private final String propertyFilePath= "configs//Configuration.properties";

	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getChromeDriverPath(){
		String driverPath = properties.getProperty("driverChromePath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public String getURL(){
		String driverPath = properties.getProperty("URL");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("URL not specified in the Configuration.properties file.");		
	}
	
	public String getExistingUserName(){
		String driverPath = properties.getProperty("existingUserEmail");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("URL not specified in the Configuration.properties file.");		
	}
	
	public String getExistingUserPwd(){
		String driverPath = properties.getProperty("existingUserPassword");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("URL not specified in the Configuration.properties file.");		
	}

	public String getBrowser(){
		String driverPath = properties.getProperty("Browser");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("URL not specified in the Configuration.properties file.");		
	}



}
