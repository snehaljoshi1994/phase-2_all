package uitest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://simplilearn.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
		
		WebElement loginlink =  driver.findElement(By.linkText("Log in"));
		loginlink.click();
	
	    WebElement Username = driver.findElement(By.name("user_login"));
	    Username.sendKeys("abc@xyz.com");
	    
	    WebElement Password = driver.findElement(By.id("password"));
	    Password.sendKeys("Outlook@123");
	    
	    WebElement Remember = driver.findElement(By.name("rememberMe"));
	    Remember.click();
	    
	    WebElement Loginbtn = driver.findElement(By.name("btn_login"));
	    Loginbtn.click();
	    
	    WebElement errormsg = driver.findElement(By.className("error_msg"));
	    System.out.println("The error msg is " + errormsg.getText());
	    
	    List<WebElement> Links =  driver.findElements(By.tagName("a"));
	    System.out.println("Total number of links are " + Links.size());
	    
	    
	    
	}

}
