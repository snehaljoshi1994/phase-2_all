package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		
		this.driver = driver;
		
	}
	public void LoginFunction(String UserNameVal,String PwdVal) {
		
		// click on the login link
	
		WebElement UserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		UserName.sendKeys(UserNameVal);

		WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys(PwdVal);

		//WebElement rememberMe = driver.findElement(By.id("remember-me"));
		//rememberMe.click();

		WebElement LoginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		LoginBtn.click();
	}

}
