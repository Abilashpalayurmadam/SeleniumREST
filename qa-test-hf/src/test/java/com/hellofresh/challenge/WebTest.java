package com.hellofresh.challenge;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pageObjects.*;
import wrapperFactory.BrowserFactory;
import wrapperFactory.SeleniumSetUp;

import java.io.IOException;
import java.util.Date;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class WebTest extends SeleniumSetUp{   



	  @Test
	  public void SignUp() throws IOException
	  {
		WebDriver driver = BrowserFactory.getBrowser(configFileReader.getBrowser());
		wait.until(ExpectedConditions.visibilityOf(SignIn.lnk_Login(driver))).click();
        String timestamp = String.valueOf(new Date().getTime());
        String email = "hf_challenge_" + timestamp + "@hf" + timestamp.substring(7) + ".com";
        String name = "Firstname";
        String surname = "Lastname";        
        SignIn.txtbx_EmailId(driver).sendKeys(email);
        SignIn.btn_Create(driver).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender2")));
        pageObjects.SignUp.opt_Title(driver).click();
        SignUp.txtbx_FirstName(driver).sendKeys(name);
        SignUp.txtbx_LastName(driver).sendKeys(surname);
        SignIn.txtbx_Password(driver).sendKeys("Qwerty");
        Select select = new Select(SignUp.dd_days(driver));
        select.selectByValue("1");
        select = new Select(SignUp.dd_Months(driver));
        select.selectByValue("1");
        select = new Select(SignUp.dd_Years(driver));
        select.selectByValue("2000");
        SignUp.txtbx_Company(driver).sendKeys("Company");
        SignUp.txtbx_Address1(driver).sendKeys("Qwerty, 123");
        SignUp.txtbx_Address2(driver).sendKeys("zxcvb");
        SignUp.txtbx_City(driver).sendKeys("Qwerty");
        select = new Select(SignUp.dd_State(driver));
        select.selectByVisibleText("Colorado");
        SignUp.txtbx_PostCode(driver).sendKeys("12345");
        SignUp.txtbx_Other(driver).sendKeys("Qwerty");
        SignUp.txtbx_Phone(driver).sendKeys("12345123123");
        SignUp.txtbx_Mobile(driver).sendKeys("12345123123");
        SignUp.txtbx_AddressAlias(driver).sendKeys("hf");
        SignUp.btn_Register(driver).click();
        WebElement heading = wait.until(ExpectedConditions.visibilityOf(MyAcct.txt_MyConfirmation(driver)));
        assertEquals(heading.getText(), "MY ACCOUNT");
        assertEquals((MyAcct.txt_AcctName(driver)).getText(), name + " " + surname);
        assertTrue(MyAcct.txt_AcctInfo(driver).getText().contains("Welcome to your account."));
        assertTrue(MyAcct.btn_LogOut(driver).isDisplayed());
        assertTrue(MyAcct.lnk_CurrentUrl(driver).contains("controller=my-account"));
        MyAcct.btn_LogOut(driver).click();
    }

	  @Test
    public void logInTest() throws IOException
    {
        String fullName = "Joe Black";
        wait.until(ExpectedConditions.visibilityOf(SignIn.lnk_Login(driver))).click();
        SignIn.txtbx_Email(driver).sendKeys(configFileReader.getExistingUserName());
        SignIn.txtbx_Password(driver).sendKeys(configFileReader.getExistingUserPwd());
        SignIn.btn_LogIn(driver).click();
        WebElement heading = MyAcct.txt_MyConfirmation(driver);
        assertEquals("MY ACCOUNT", heading.getText());
        assertEquals(fullName, MyAcct.txt_AcctName(driver).getText());
        assertTrue(MyAcct.txt_AcctInfo(driver).getText().contains("Welcome to your account."));
        assertTrue(MyAcct.btn_LogOut(driver).isDisplayed());
        assertTrue(MyAcct.lnk_CurrentUrl(driver).contains("controller=my-account"));
        MyAcct.btn_LogOut(driver).click();
        
    }

	  @Test
    public void checkoutTest () throws IOException
    {
        SignIn.lnk_Login(driver).click();
        SignIn.txtbx_Email(driver).sendKeys(configFileReader.getExistingUserName());
        SignIn.txtbx_Password(driver).sendKeys(configFileReader.getExistingUserPwd());
        SignIn.btn_LogIn(driver).click();
        MyAcct.lnk_Women(driver).click();
        wait.until(ExpectedConditions.visibilityOf(Products.lnk_Product(driver))).click();
        wait.until(ExpectedConditions.visibilityOf(Products.btn_AddToCart(driver))).click();
        wait.until(ExpectedConditions.visibilityOf(Products.btn_CheckOut(driver))).click();
        wait.until(ExpectedConditions.visibilityOf(OrderSummary.btn_ProceedCheckOut(driver))).click();
        wait.until(ExpectedConditions.visibilityOf(OrderAddress.btn_ProceedAddress(driver))).click();
        wait.until(ExpectedConditions.visibilityOf(OrderShipping.chk_IAgree(driver))).click();
        wait.until(ExpectedConditions.visibilityOf(OrderShipping.btn_ProceedShip(driver))).click();
        wait.until(ExpectedConditions.visibilityOf(Payment.chk_BankWire(driver))).click();
        Payment.btn_PaymentConfirm(driver).click();
        WebElement heading = OrderConfirm.txt_Confirmation(driver);
        assertEquals("ORDER CONFIRMATION", heading.getText());
        assertTrue(MyAcct.txt_StepDone(driver).isDisplayed());
        assertTrue(MyAcct.txt_StepLast(driver).isDisplayed());
        assertTrue(MyAcct.txt_YourOrderComplete(driver).getText().contains("Your order on My Store is complete."));
        assertTrue(MyAcct.lnk_CurrentUrl(driver).contains("controller=order-confirmation"));
        MyAcct.btn_LogOut(driver).click();
    }


}
