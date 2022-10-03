import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.greenkart;


public class verifyAddtoKart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Desktop\\velocity\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		greenkart GC=new greenkart(driver);
		GC.clickOnquantitybox();
		GC.ClickOnAddtobag();
		GC.clickOngotobag();
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
	
		if(url.equals(url)&&title.equals(title))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
	
}}
