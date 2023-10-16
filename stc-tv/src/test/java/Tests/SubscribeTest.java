package Tests;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.shaft.driver.SHAFT;
import Pages.Subscribe;
public class SubscribeTest {
	
    private SHAFT.GUI.WebDriver driver;
	private Subscribe sub =null;

	 @Test
	    public void Validate_Packages_Type_And_Price_And_currecny_For_KSA() {
		 sub.selectCountry("ksa");
		Assert.assertEquals( sub.getPackagePrice("lite"),"15");
		Assert.assertEquals( sub.getPackageCurrency("lite"),"SAR/month");
		Assert.assertEquals( sub.getPackageType("classic"),"CLASSIC");
		Assert.assertEquals( sub.getPackagePrice("classic"),"25");
		Assert.assertEquals( sub.getPackageCurrency("classic"),"SAR/month");
		Assert.assertEquals( sub.getPackageType("premium"),"PREMIUM");
		Assert.assertEquals( sub.getPackagePrice("premium"),"60");
		Assert.assertEquals( sub.getPackageCurrency("premium"),"SAR/month");
	
	    }
	 
	     @Test
	    public void Validate_Packages_Type_And_Price_And_currecny_For_Kuwait() {
			 sub.selectCountry("kw");
		Assert.assertEquals( sub.getPackagePrice("lite"),"1.2");
		Assert.assertEquals( sub.getPackageCurrency("lite"),"KWD/month");
		Assert.assertEquals( sub.getPackageType("classic"),"CLASSIC");
		Assert.assertEquals( sub.getPackagePrice("classic"),"2.5");
		Assert.assertEquals( sub.getPackageCurrency("classic"),"KWD/month");
		Assert.assertEquals( sub.getPackageType("premium"),"PREMIUM");
		Assert.assertEquals( sub.getPackagePrice("premium"),"4.8");
		Assert.assertEquals( sub.getPackageCurrency("premium"),"KWD/month");
	
	    }
	 
	 
	     @Test
	    public void Validate_Packages_Type_And_Price_And_currecny_For_Bahrain() {
			 sub.selectCountry("bh");
		Assert.assertEquals( sub.getPackageType("lite"),"LITE");
		Assert.assertEquals( sub.getPackagePrice("lite"),"2");
		Assert.assertEquals( sub.getPackageCurrency("lite"),"BHD/month");
		Assert.assertEquals( sub.getPackageType("classic"),"CLASSIC");
		Assert.assertEquals( sub.getPackagePrice("classic"),"3");
		Assert.assertEquals( sub.getPackageCurrency("classic"),"BHD/month");
		Assert.assertEquals( sub.getPackageType("premium"),"PREMIUM");
		Assert.assertEquals( sub.getPackagePrice("premium"),"6");
		Assert.assertEquals( sub.getPackageCurrency("premium"),"BHD/month");
	
	    }
	 

	
	  @BeforeTest
	  public void beforeTest() {
		  driver = new SHAFT.GUI.WebDriver();
		 sub  = new Subscribe(driver);

		  driver.browser().maximizeWindow();
		  driver.browser().navigateToURL("https://subscribe.stctv.com/sa-en");
	  }
	@AfterClass()
	public void afterClass(){
	        driver.quit();
	    }

}
