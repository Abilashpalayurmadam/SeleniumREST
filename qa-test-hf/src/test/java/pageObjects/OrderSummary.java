package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderSummary {

	private static WebElement element = null;
	 
	 public static WebElement btn_ProceedCheckOut(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']"));
	 
	    return element;
	 
	    }
}
