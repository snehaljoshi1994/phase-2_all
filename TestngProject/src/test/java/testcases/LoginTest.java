package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	@Test
	public void LoginFailureTest() {
		
		  LoginPage login = new LoginPage(driver);
		  login.LoginFunction("abc@xyz.com","Abc@1234");

			
		    WebElement errormsg = driver.findElement(By.className("error_msg"));
		    System.out.println("The error msg is " + errormsg.getText());
		    
		    String actMsg = errormsg.getText();
		    String expMsg = "The email or password you have entered is invalid.";
		    Assert.assertEquals(actMsg, expMsg);
	}
	
	@Test
	public void LoginSuccessTest() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("snehal@gmail.com" , "Outlook");
		
	}
}
