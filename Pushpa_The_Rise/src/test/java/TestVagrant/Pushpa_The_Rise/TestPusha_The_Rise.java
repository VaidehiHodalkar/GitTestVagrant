package TestVagrant.Pushpa_The_Rise;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import resources.Base;


public class TestPusha_The_Rise extends Base  {
    
	//Navigating to required Website 
	@BeforeTest
	public void NavigatetoWebsite() throws InterruptedException, IOException
	{    
		 driver = initializeDriver();
		 prop = extractData();
		 String browserURL=prop.getProperty("URL");
		 driver.navigate().to(browserURL);
		 Thread.sleep(3000L);
		 String MovieName=prop.getProperty("MovieName");
		 LandingPage l = new LandingPage(driver);
		 l.searchMovie().sendKeys(MovieName);
		 Thread.sleep(2000L);
		 l.selectMovie().click();
	}
		
	//Verifying CountryofOrigin
	@Test
	public void GetCountryofOrigin() throws IOException 
	{
		
		String MovieCountry=prop.getProperty("MovieCountry");
		LandingPage l = new LandingPage(driver);
		String CountryofOrigin = l.VerifyCountry().getText();	
		 System.out.print(CountryofOrigin);
		if(CountryofOrigin.equals(MovieCountry))
		{
				Assert.assertTrue(true);
				System.out.println("Country of the movie is :" +CountryofOrigin);
		}
			else
			{
				System.out.println("Displayed Country of the movie is not correct");
				Assert.assertTrue(false);
			}
	}
	
	
	//Verifying Release Date
	@Test
	public void GetReleaseDate() throws IOException 
	{  
		
		String MovieReleaseDate=prop.getProperty("MovieReleaseDate");
		LandingPage l = new LandingPage(driver);
		String ReleaseDate = l.VerifyReleaseDate().getText();
		 System.out.print(ReleaseDate);
		if(ReleaseDate.equals(MovieReleaseDate))
		{
				Assert.assertTrue(true);
				System.out.println("Country of the movie is :" +ReleaseDate);
		}
			else
			{
				System.out.println("Displayed Country of the movie is not correct");
				Assert.assertTrue(false);
			}
	}
		
   @AfterClass
	public void quit() {
	driver.close();
	}
}
