package Pages;
import org.openqa.selenium.By;
import com.shaft.driver.SHAFT.GUI.WebDriver;
public class Subscribe {
	
	
	
	private WebDriver driver;
	public Subscribe(WebDriver driver) {
		this.driver=driver;
		
	}
	
  
	
	private By country_MenuBtn = new By.ByXPath("//a[@id='country-btn']");
	private By kw_CountryLink = new By.ById("kw");
	private By sa_CountryLink = new By.ById("sa");
	private By bh_CountryLink = new By.ById("bh");
	private By lite_Package = new By.ById("name-lite");
	private By classic_Package = new By.ById("name-classic");
	private By premium_Package = new By.ById("name-premium");
	private By lite_price = new  By.ByCssSelector("#currency-lite > b");
	private By classic_price = new By.ByCssSelector("#currency-classic > b");
	private By premium_price = new By.ByCssSelector("#currency-premium > b");
	private By lite_Currency = new By.ByCssSelector("#currency-lite > i");
	private By classic_Currency = new By.ByCssSelector("#currency-classic > i");
	private By premium_currency = new By.ByCssSelector("#currency-premium > i");

    


	
	public void selectCountry(String country)
	{
		driver.element().click(country_MenuBtn);
		
	         if (country=="kw")
	         {
	        	 driver.element().click(kw_CountryLink);
	         }
	         else if (country=="bh") {
	        	 driver.element().click(bh_CountryLink);
	         }
	         else {
	        	 
	        	 driver.element().click(sa_CountryLink);
	         }
		  
	}
	
	public String getPackagePrice(String Package) {
		
		String PackagePrice = null;
		
		if (Package=="lite")
		{
			 PackagePrice = driver.element().getText(lite_price);
		}
		else if (Package=="classic")
		{
			 PackagePrice = driver.element().getText(classic_price);
		}
		else {
			 PackagePrice = driver.element().getText(premium_price);

		}
		return PackagePrice;
	}
	
public String getPackageCurrency(String Package) {
		
		
		String PackageCurrency=null;
		
		if (Package=="lite")
		{
			 PackageCurrency = driver.element().getText(lite_Currency);
		}
		else if (Package=="classic")
		{
			 PackageCurrency = driver.element().getText(classic_Currency);
		}
		else {
			 PackageCurrency = driver.element().getText(premium_currency);

		}
		return PackageCurrency;
	}
	
	
	public String getPackageType(String type) {
		
    String packageTitle = null;
		
		if (type=="lite")
		{
			packageTitle=driver.element().getText(lite_Package);
		}
		else if (type=="classic")
		{
			packageTitle=driver.element().getText(classic_Package);
		}
		else {
			packageTitle=driver.element().getText(premium_Package);

		}
		return packageTitle;
		
	}
	
	
}
