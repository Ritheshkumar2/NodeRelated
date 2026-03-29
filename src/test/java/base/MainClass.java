package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.GetScreenshot;

	public class MainClass extends BaseClass {

	    @BeforeClass
	    @Parameters("browser")
	    public void launchBrowser(String browser) throws Exception {
	        setUpBrowser(browser);
	        
	        }

	    @Test
	    public void sampleTest() {
	    	getDriver().get("https://testautomationpractice.blogspot.com/");
	        GetScreenshot.getscreenshot(getDriver(), "mainpage");
	        System.out.println("Test is running on: " + getDriver());
	        System.out.println(getDriver().getTitle());
	    }

	    @AfterClass
	    public void teardown() {
	        getDriver().quit();
	    }
	
}
