package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Login;

public class LoginTest extends BaseClass {
	
	
	@Test
	public void LoginFailureTest() {
		
		  Login login = new Login(driver);
		  login.LoginFunction("standard_user","secret_sauce1");

			
		    WebElement errormsg = driver.findElement(By.xpath("//h3"));
		    System.out.println("The error msg is " + errormsg.getText());
		    
		    String actMsg = errormsg.getText();
		    String expMsg = "Epic sadface: Username and password do not match any user in this service";
		    Assert.assertEquals(actMsg, expMsg);
	}
	
	@Test
	public void LoginSuccessTest() {
		
		Login login = new Login(driver);
		login.LoginFunction("standard_user" , "secret_sauce");
		
		WebElement validPage = driver.findElement(By.xpath("//div[@class='product_label']"));
		System.out.println(validPage.getText());

		Assert.assertEquals(validPage.getText(), "Products");

		
	}
}
