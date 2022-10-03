package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class greenkart {
	@FindBy (xpath="(//input[@class='quantity'])[3]")
	private WebElement quantitybox;
	
	@FindBy (xpath="(//button[@type='button'])[4]")
	private WebElement addtobag;
	
	@FindBy (xpath="//a[@class='cart-icon']")
	private WebElement gotobag;
	
	
	
	public greenkart(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnquantitybox () {
	quantitybox.sendKeys("0");
	}
	
	public void ClickOnAddtobag () {
	addtobag.click();;
	}
	
	public void clickOngotobag () {
	gotobag.click();
	}
	
	
	


}
