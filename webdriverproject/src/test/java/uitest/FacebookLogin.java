package uitest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
		
		WebElement Email = driver.findElement(By.id("email"));
	    Email.sendKeys("abc@xyz.com");
	    
	    WebElement Password = driver.findElement(By.id("pass"));
	    Password.sendKeys("Outlook@123");
	    
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();

	}

}
