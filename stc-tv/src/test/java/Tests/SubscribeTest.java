package Tests;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.shaft.driver.SHAFT;
import Pages.Subscribe;
public class SubscribeTest {
	
    private SHAFT.GUI.WebDriver driver;

	
	 @Test
	    public void Validate_Packages_Type_And_Price_And_currecny_For_KSA() {
		 new Subscribe(driver).selectCountry("ksa");
		Assert.assertEquals( new Subscribe(driver).getPackageType("lite"),"LITE");
		Assert.assertEquals( new Subscribe(driver).getPackagePrice("lite"),"15");
		Assert.assertEquals( new Subscribe(driver).getPackageCurrency("lite"),"SAR/month");
		Assert.assertEquals( new Subscribe(driver).getPackageType("classic"),"CLASSIC");
		Assert.assertEquals( new Subscribe(driver).getPackagePrice("classic"),"25");
		Assert.assertEquals( new Subscribe(driver).getPackageCurrency("classic"),"SAR/month");
		Assert.assertEquals( new Subscribe(driver).getPackageType("premium"),"PREMIUM");
		Assert.assertEquals( new Subscribe(driver).getPackagePrice("premium"),"60");
		Assert.assertEquals( new Subscribe(driver).getPackageCurrency("premium"),"SAR/month");
	
	    }
	 
	     @Test
	    public void Validate_Packages_Type_And_Price_And_currecny_For_Kuwait() {
		 new Subscribe(driver).selectCountry("kw");
		Assert.assertEquals( new Subscribe(driver).getPackageType("lite"),"LITE");
		Assert.assertEquals( new Subscribe(driver).getPackagePrice("lite"),"1.2");
		Assert.assertEquals( new Subscribe(driver).getPackageCurrency("lite"),"KWD/month");
		Assert.assertEquals( new Subscribe(driver).getPackageType("classic"),"CLASSIC");
		Assert.assertEquals( new Subscribe(driver).getPackagePrice("classic"),"2.5");
		Assert.assertEquals( new Subscribe(driver).getPackageCurrency("classic"),"KWD/month");
		Assert.assertEquals( new Subscribe(driver).getPackageType("premium"),"PREMIUM");
		Assert.assertEquals( new Subscribe(driver).getPackagePrice("premium"),"4.8");
		Assert.assertEquals( new Subscribe(driver).getPackageCurrency("premium"),"KWD/month");
	
	    }
	 
	 
	     @Test
	    public void Validate_Packages_Type_And_Price_And_currecny_For_Bahrain() {
		 new Subscribe(driver).selectCountry("bh");
		Assert.assertEquals( new Subscribe(driver).getPackageType("lite"),"LITE");
		Assert.assertEquals( new Subscribe(driver).getPackagePrice("lite"),"2");
		Assert.assertEquals( new Subscribe(driver).getPackageCurrency("lite"),"BHD/month");
		Assert.assertEquals( new Subscribe(driver).getPackageType("classic"),"CLASSIC");
		Assert.assertEquals( new Subscribe(driver).getPackagePrice("classic"),"3");
		Assert.assertEquals( new Subscribe(driver).getPackageCurrency("classic"),"BHD/month");
		Assert.assertEquals( new Subscribe(driver).getPackageType("premium"),"PREMIUM");
		Assert.assertEquals( new Subscribe(driver).getPackagePrice("premium"),"6");
		Assert.assertEquals( new Subscribe(driver).getPackageCurrency("premium"),"BHD/month");
	
	    }
	 

	
	  @BeforeTest
	  public void beforeTest() {
		  driver = new SHAFT.GUI.WebDriver();
		  driver.browser().maximizeWindow();
		  driver.browser().navigateToURL("https://subscribe.stctv.com/sa-en");
	  }
	@AfterClass()
	public void afterClass(){
	        driver.quit();
	    }

}
