package mobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utility.DriverUtility;

public class ClickGesture {
  @Test
  public void testClickGesture() {
	  	  
	  AppiumDriver driver = DriverUtility.initAndroidSession();
	  WebElement element = driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  //Click Gesture
	  driver.executeScript("mobile: clickGesture", ImmutableMap.of("elementId",((RemoteWebElement) element).getId()));	  
	  Utility.takeScreenshot(driver);
	  System.out.println("Click Gesture completed!");
	  
  }
}
