/**
 * 
 */
package wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Nikhil
 * LoginPage using Page Factory and Findby
 */
public class LoginPagePF {
	
	WebDriver driver;
	
	public LoginPagePF(WebDriver Idriver)
	{
		this.driver=Idriver;
	}

	@FindBy(id="user_login") 
	@CacheLookup//only use this when you are sure when this web elements will never change
	WebElement username;
	
	//Standard approach is using HOW
	@FindBy(how=How.ID, using="user_pass") 
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[@id='wp-submit']") 
	@CacheLookup
	WebElement submit_button;
	
	@FindBy(how=How.LINK_TEXT, using="Lost your Password?") 
	@CacheLookup
	WebElement forget_password_link;
	
	public void login_wordpress(String uid,String pas)
	{
		username.sendKeys(uid);
		password.sendKeys(pas);
		submit_button.click();
	}
	
}
