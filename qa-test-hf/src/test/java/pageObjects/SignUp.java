package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {

	private static WebElement element = null;
	
	 public static WebElement opt_Title(WebDriver driver){
		 
		    element = driver.findElement(By.id("id_gender2"));
		 
		    return element;
		 
		    }
	    public static WebElement txtbx_FirstName(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("customer_firstname"));
	 
	         return element;
	 
	         }
	    public static WebElement txtbx_LastName(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("customer_lastname"));
	 
	         return element;
	 
	         }
	    public static WebElement dd_days(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("days"));
	 
	         return element;
	 
	         }
	    public static WebElement dd_Months(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("months"));
	 
	         return element;
	 
	         }
	    public static WebElement dd_Years(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("years"));
	 
	         return element;
	 
	         }
	    public static WebElement txtbx_Company(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("company"));
	 
	         return element;
	 
	         }
	    public static WebElement txtbx_Address1(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("address1"));
	 
	         return element;
	 
	         }
	    public static WebElement txtbx_Address2(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("address2"));
	 
	         return element;
	 
	         }
	    public static WebElement txtbx_City(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("city"));
	 
	         return element;
	 
	         }
	    public static WebElement dd_State(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("id_state"));
	 
	         return element;
	 
	         }
	    public static WebElement txtbx_PostCode(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("postcode"));
	 
	         return element;
	 
	         }
	    public static WebElement txtbx_Other(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("other"));
	 
	         return element;
	 
	         }
	    public static WebElement txtbx_Phone(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("phone"));
	 
	         return element;
	 
	         }
	    public static WebElement txtbx_Mobile(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("phone_mobile"));
	 
	         return element;
	 
	         }

	    public static WebElement txtbx_AddressAlias(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("alias"));
	 
	         return element;
	 
	         }
	    public static WebElement btn_Register(WebDriver driver){
		   	 
	         element = driver.findElement(By.id("submitAccount"));
	 
	         return element;
	 
	         }
}

