package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
        WebElement signinbtn =driver.findElement(By.id("signin_button"));
        
        signinbtn.click();
       driver.findElement(By.id("user_login")).sendKeys("username");
       
       driver.findElement(By.id("user_password")).sendKeys("password");
       
       driver.findElement(By.name("submit")).click();
       driver.quit();
       
	}

}
