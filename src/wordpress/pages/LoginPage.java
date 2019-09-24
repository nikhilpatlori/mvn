/**
 * 
 */
package wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Nikhil
 * This Class will store all the locator and methods of login page
 */
public class LoginPage {
    WebDriver driver;
	By username = By.id("user_login");
	By password = By.xpath("//*[@id='user_pass']");
	By loginButton = By.name("wp-submit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("admin");
	}
	public void typeUserName(String Uname)
	{
		driver.findElement(username).sendKeys(Uname);
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("demo123");
	}
	public void typePassword(String PSWD)
	{
		driver.findElement(password).sendKeys(PSWD);
	}
	
	public void ClickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
	public void loginToWordpress(String userid, String pass){
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
}
