package base;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setUpBrowser(String browser) throws Exception {

    	  URL url = new URL("http://localhost:4444");

    	    System.out.println("Connecting to Grid: " + url);
    	    System.out.println("Browser: " + browser);

    	    if (browser.equalsIgnoreCase("chrome")) {
    	        driver.set(new RemoteWebDriver(url, new ChromeOptions()));
    	    } else {
    	        driver.set(new RemoteWebDriver(url, new EdgeOptions()));
    	    }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}