package utils;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import base.BaseClass;

public class GetScreenshot{
		
	public static void getscreenshot(WebDriver driver,String filename) {
		
		try {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File src = ts.getScreenshotAs(OutputType.FILE);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String timestamp = sdf.format(new Date());

            filename = "screenshot_" + timestamp + ".png";

            File dest = new File("target/screenshots/" + filename);

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot saved: " + dest.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
