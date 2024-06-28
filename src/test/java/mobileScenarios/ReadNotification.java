package mobileScenarios;

import java.time.Duration;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import utility.DriverUtility;

public class ReadNotification {
  @Test
  public void testReadNotification() {
	  AppiumDriver driver = DriverUtility.initAndroidSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	  
	  ((AndroidDriver)driver).openNotifications();
	  
	  
  }
}
