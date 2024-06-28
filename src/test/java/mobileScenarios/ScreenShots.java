package mobileScenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utility.DriverUtility;

public class ScreenShots {
  @Test
  public void captureScreenShots() throws IOException {
	  
	  AppiumDriver driver = DriverUtility.initAndroidSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File temp = ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File(System.getProperty("user.dir")+"//Screenshots//APIDemos"+System.currentTimeMillis()+".png");
	  FileHandler.copy(temp, dest);
	  System.out.println("Screenshot captured!");
	  
  }
}
