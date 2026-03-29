package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class MainClass extends BaseClass {

	    @BeforeClass
	    @Parameters("browser")
	    public void launchBrowser(String browser) throws Exception {
	        setUpBrowser(browser);
	        getDriver().get("https://testautomationpractice.blogspot.com/");
	    }

	    @Test
	    public void sampleTest() {
	        System.out.println("Test is running on: " + getDriver());
	    }

	    @AfterClass
	    public void teardown() {
	        getDriver().quit();
	    }
	
}
