package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment {

	private static WebElement element = null;
	 
	 public static WebElement chk_BankWire(WebDriver driver){
	 
	    element = driver.findElement(By.className("bankwire"));
	 
	    return element;
	 
	    }
	 
	 public static WebElement btn_PaymentConfirm(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//*[@id='cart_navigation']/button"));
		 
		    return element;
		 
		    }
	
}
