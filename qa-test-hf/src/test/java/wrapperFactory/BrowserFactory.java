package wrapperFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.HashMap;
import java.util.Map;
import dataProviders.*;

public class BrowserFactory 
{
	static ConfigFileReader configFileReader;
	
	
	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	 
	/*
	 * Factory method for getting browsers
	 */
	public static WebDriver getBrowser(String browserName) {
		configFileReader= new ConfigFileReader();
		WebDriver driver = null;
 
		switch (browserName) {
		case "Firefox":
			driver = drivers.get("Firefox");
			if (driver == null) {
				driver = new FirefoxDriver();
				drivers.put("Firefox", driver);
			}
			break;
		case "IE":
			driver = drivers.get("IE");
			if (driver == null) {
				
				System.setProperty("webdriver.ie.driver",
						"src/test/resources/MicrosoftWebDriver.exe");
				driver = new InternetExplorerDriver();
				drivers.put("IE", driver);
			}
			break;
		case "Chrome":
			driver = drivers.get("Chrome");
			if (driver == null) {
				String path=configFileReader.getChromeDriverPath();
				System.setProperty("webdriver.chrome.driver",path);
				driver = new ChromeDriver();
				drivers.put("Chrome", driver);
			}
			break;
		}
		return driver;
	}

	public static void closeAllDriver() {
		for (String key : drivers.keySet()) {
			drivers.get(key).close();
			drivers.get(key).quit();
		}
		}
	
}


