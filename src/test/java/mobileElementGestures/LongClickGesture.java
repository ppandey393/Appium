package mobileElementGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utility.DriverUtility;

public class LongClickGesture {
  @Test
  public void testLongClickGesture() {
	  
	  AppiumDriver driver = DriverUtility.initAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //Drag and Drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //3rd dot
	  WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  //Long Click Gesture
	  driver.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"duration",3000));
	  System.out.println("Long Click Gesture Completed!");
	  
  }
}
