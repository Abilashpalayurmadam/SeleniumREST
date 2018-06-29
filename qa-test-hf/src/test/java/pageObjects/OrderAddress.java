package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderAddress {

	private static WebElement element = null;
	 
	 public static WebElement btn_ProceedAddress(WebDriver driver){
	 
	    element = driver.findElement(By.name("processAddress"));
	 
	    return element;
	 
	    }
}
