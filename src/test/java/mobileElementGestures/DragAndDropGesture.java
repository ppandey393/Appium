package mobileElementGestures;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utility.DriverUtility;

public class DragAndDropGesture {
  @Test
  public void testDragAndDropGesture() {
	  
	  AppiumDriver driver = DriverUtility.initAndroidSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //Drag and Drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //3rd dot
	  WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  //Drag Gesture
	  driver.executeScript("mobile: dragGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"endX",651, "endY",1026));
	  
	  String text = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  System.out.println("Result Text is: "+text);
	  System.out.println("Drag and Drop Gesture Completed!");
  }
}
