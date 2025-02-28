package pageObject;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Base;

public class LandingPage extends Base {
	
	public WebDriver driver;
	public Properties prop;
	
	
	By SearchMovie = By.xpath("//input[@type=\"text\"]");
	By SelectMovie = By.xpath("//li[@role=\"option\"]//a[1]");
	By VerifyCountry = By.xpath("//li[@data-testid=\"title-details-origin\"]//a[1]");
	By VerifyReleaseDate =By.xpath("//*[contains(text(),'Release date')]/following-sibling::div[@class=\"ipc-metadata-list-item__content-container\"]//a[1]");


	public LandingPage( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public LandingPage(Properties prop) {
		// TODO Auto-generated constructor stub
		this.prop = prop;
	}

	public WebElement searchMovie() throws IOException
	{
		
		return driver.findElement(SearchMovie);
	}
	
	public WebElement selectMovie() throws IOException
	{
		
		return driver.findElement(SelectMovie);
	}
	
    
	public WebElement VerifyCountry() throws IOException
	{
		
		return driver.findElement(VerifyCountry);
	}
	
	public WebElement VerifyReleaseDate() throws IOException
	{
		
		return driver.findElement(VerifyReleaseDate);
	}
	
	
}
