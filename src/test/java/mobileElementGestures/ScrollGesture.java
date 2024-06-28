package mobileElementGestures;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utility.DriverUtility;

public class ScrollGesture {
  @Test
  public void testScrollGesture() throws InterruptedException {
	  
	  AppiumDriver driver = DriverUtility.initAndroidSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  // view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  Thread.sleep(2000);
	  // Select all elements
	  WebElement pagearea = driver.findElement(AppiumBy.id("android:id/list"));

	  // Scroll down
	  //driver.executeScript("mobile: scrollGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "down", "percent", 0.75));
	  //System.out.println("Scroll down is completed!");

	  //Utility.scrollDown(driver, pagearea);
	  Utility.scrollDownToCount(driver, pagearea, 3);

	  System.out.println("Scroll down is completed!");
	  Thread.sleep(2000);
	  
	  Utility.scrollUp(driver, pagearea);
	  System.out.println("Scroll up is completed!");
	  
	  System.out.println("Page Scroll completed!");
	  
  }
}
