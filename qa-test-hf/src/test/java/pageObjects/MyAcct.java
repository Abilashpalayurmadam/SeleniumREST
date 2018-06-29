package pageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class MyAcct {

	private static WebElement element = null;
	 
	 public static WebElement lnk_Women(WebDriver driver){
	 
	    element = driver.findElement(By.linkText("Women"));
	 
	    return element;
	 
	    }
	 
	 public static WebElement txt_MyConfirmation(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("h1"));
		 
		    return element;
		 
		    }
	 public static WebElement txt_AcctName(WebDriver driver){
		 
		    element = driver.findElement(By.className("account"));
		 
		    return element;
		 
		    }
	 public static WebElement txt_AcctInfo(WebDriver driver){
		 
		    element = driver.findElement(By.className("info-account"));
		 
		    return element;
		 
		    }
	 public static WebElement btn_LogOut(WebDriver driver){
		 
		    element = driver.findElement(By.className("logout"));
		 
		    return element;
		 
		    }
	 public static String lnk_CurrentUrl(WebDriver driver){
		 
		   String element = driver.getCurrentUrl();
		 
		    return element;
		 
		    }
	 
	 public static WebElement txt_StepDone(WebDriver driver){
		 
		   element = driver.findElement(By.xpath("//li[@class='step_done step_done_last four']"));
		 
		    return element;
		 
		    }
	 
	 public static WebElement txt_StepLast(WebDriver driver){
		 
		   element = driver.findElement(By.xpath("//li[@id='step_end' and @class='step_current last']"));
		 
		    return element;
		 
		    }
	 public static WebElement txt_YourOrderComplete(WebDriver driver){
		 
		   element = driver.findElement(By.xpath("//*[@class='cheque-indent']/strong"));
		 
		    return element;
		 
		    }
	 


}
