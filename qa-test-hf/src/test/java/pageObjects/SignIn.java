package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class SignIn {
	
	private static WebElement element = null;
	 
	 public static WebElement lnk_Login(WebDriver driver){
	 
	    element = driver.findElement(By.className("login"));
	 
	    return element;
	 
	    }

	    public static WebElement txtbx_EmailId(WebDriver driver){
	 
	         element = driver.findElement(By.id("email_create"));
	 
	         return element;
	 
	         }
	 
	    public static WebElement btn_Create(WebDriver driver){
	   	 
	         element = driver.findElement(By.id("SubmitCreate"));
	 
	         return element;
	 
	         }
	    
	
	    public static WebElement txtbx_Email(WebDriver driver){
	   	 
	         element = driver.findElement(By.id("email"));
	 
	         return element;
	 
	         }
	     public static WebElement txtbx_Password(WebDriver driver){
	 
	         element = driver.findElement(By.id("passwd"));
	 
	         return element;
	 
	         }
	 
	     public static WebElement btn_LogIn(WebDriver driver){
	 
	         element = driver.findElement(By.id("SubmitLogin"));
	 
	         return element;
	 
	         }
	 
}
