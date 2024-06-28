package mobileScenarios;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.*;
import utility.DriverUtility;

public class KeyEvent {
  @Test
  public void testKeyboard() throws InterruptedException {
	  
	  AppiumDriver driver = DriverUtility.initAndroidSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  //View
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  Thread.sleep(2000);
	  
	  //Scroll down to reach element
	  WebElement pagearea = driver.findElement(AppiumBy.id("android:id/list"));
	  Utility.scrollDownToCount(driver, pagearea, 3);
	  	  
	  //Text Field
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  //Enter Text
	  //field1 - user input
	  driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).sendKeys("Welcome to Appium");
	  System.out.println("User input is successful!");
	  
	  //field2 - keyboard input
	  driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit1")).click();
	 // ((AndroidDriver)driver).pressKey(new KeyEvent.withKey(AndroidKey.W));
	  ((AndroidDriver)driver).pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.W));
	  ((AndroidDriver)driver).pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.E));
	  ((AndroidDriver)driver).pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.L));
	  ((AndroidDriver)driver).pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.C));
	  ((AndroidDriver)driver).pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.O));
	  ((AndroidDriver)driver).pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.M));
	  ((AndroidDriver)driver).pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.E));
	  System.out.println("Keyboard input is successful!");
	  
	  
  }
}
