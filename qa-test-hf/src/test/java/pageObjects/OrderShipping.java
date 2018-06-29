package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderShipping {

	private static WebElement element = null;
	 
	 public static WebElement chk_IAgree(WebDriver driver){
	 
	    element = driver.findElement(By.id("uniform-cgv"));
	 
	    return element;
	 
	    }
	 
	 public static WebElement btn_ProceedShip(WebDriver driver){
		 
		    element = driver.findElement(By.name("processCarrier"));
		 
		    return element;
		 
		    }
}