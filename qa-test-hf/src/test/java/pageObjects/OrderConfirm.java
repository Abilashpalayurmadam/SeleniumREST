package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirm {

	private static WebElement element = null;
	 
	 public static WebElement txt_Confirmation(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("h1"));
		 
		    return element;
		 
		    }
}
