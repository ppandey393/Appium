package mobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utility.DriverUtility;

public class DoubleClickGesture {
  @Test
  public void testDoubleClickGesture() {
	  
AppiumDriver driver = DriverUtility.initAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //Drag and Drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //3rd dot
	  WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  //DoubleClick Gesture
	  driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));
	  Utility.takeScreenshot(driver);
	  System.out.println("Double Click Gesture Completed!");
	  
	  
	  
  }
}
