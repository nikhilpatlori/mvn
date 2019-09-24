/**
 * 
 */
package wordpress.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import wordpress.pages.LoginPage;
import wordpress.pages.LoginPagePF;

/**
 * @author Nikhil
 *
 */
public class VerifyValidLoginPF {

@Test
public void checkValidUser()
{
	//This will launch the browser and go to the given url
	WebDriver driver = BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
	
	//Created Page Object using page Factory
	LoginPagePF login_new = PageFactory.initElements(driver, LoginPagePF.class);
	//LoginPage login_old = PageFactory.initElements(driver, LoginPage.class);
	
	//Call the method
	login_new.login_wordpress("admin", "demo123");
}
	
	
	
	
}
