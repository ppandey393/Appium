package mobileElementGestures;

import java.time.Duration;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

//import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utility.DriverUtility;

public class SwipeGesture {
  @Test
  public void testSwipeGesture() {
	  
	  AppiumDriver driver = DriverUtility.initAndroidSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  //View
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();

	  //Gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	
	  //Photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	
	  //PageArea
	  WebElement pagearea = driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  Utility.swipeLeft(driver, pagearea);
	  System.out.println("Swipe Left Gesture completed!");
	  
	  Utility.swipeRight(driver, pagearea);
	  System.out.println("Swipe Right Gesture completed!");
		
	
  }
}
