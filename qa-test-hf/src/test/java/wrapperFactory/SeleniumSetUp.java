package wrapperFactory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.openqa.selenium.support.ui.WebDriverWait;
import wrapperFactory.ScreenShotOnFailure;
import reports.JUnitHTMLReporter;

public class SeleniumSetUp extends JUnitHTMLReporter{
	@Rule
    public ScreenShotOnFailure failure = new ScreenShotOnFailure(driver);
	  @BeforeClass
	  public static void setUp()
	  {
		    wait = new WebDriverWait(driver, 10, 50);
	        driver.get(configFileReader.getURL());
	     
	  } 
	  
	    @AfterClass
		 public static void closeBrowser()
	    {
			 BrowserFactory.closeAllDriver();
		}

}
