package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products {
	private static WebElement element = null;


	 public static WebElement lnk_Product(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement lnk_Products(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']/ancestor::li"));
		 
		    return element;
		 
		    }
	 
	 
	 public static WebElement btn_AddToCart(WebDriver driver){
		 
		    element = driver.findElement(By.name("Submit"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement btn_CheckOut(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//*[@id='layer_cart']//a[@class and @title='Proceed to checkout']"));
		 
		    return element;
		 
		    }
}
