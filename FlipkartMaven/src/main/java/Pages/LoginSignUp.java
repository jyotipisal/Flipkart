package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSignUp {
	@FindBy (xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;
	
	@FindBy (xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginbutton;
		
	public LoginSignUp(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername () {
	username.sendKeys("jyoti3pisal7@gmail.com");
	}
	
	public void password () {
	password.sendKeys("jyotiii@3");
	}
	
	public void loginbutton () {
	username.click();;
	}
	
	
}
