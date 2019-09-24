/**
 * 
 */
package wordpress.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import wordpress.pages.LoginPage;

/**
 * @author Nikhil
 *
 */
public class VerifyWordpressLogin {

	@Test
	public void VerifyValidLogin()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage login = new LoginPage(driver);
//		login.typeUserName();
//		login.typePassword();
//		login.ClickOnLoginButton();
		login.loginToWordpress("admin", "demo123");
		driver.quit();
	}
}
