package mobileScenarios;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utility.DriverUtility;

public class AlertHandling {
  @Test
  public void testAlertHandling() {
	  
	  /* 3 alerts - simple alert, confirmation alert, prompt alerts
	   * return type of alert mehods is alert
	   * Alert is interface in selenium WebDriver
	   * Alert alt = driver.switchTo().alert();
	   * getText() 	accept()  dismiss()  sendKeys()
	   */
	  
	  AppiumDriver driver = DriverUtility.initAndroidSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  //App
	  driver.findElement(AppiumBy.accessibilityId("App")).click();

	  //Alert
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	
	  //Ok Cancel
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  Alert alt = driver.switchTo().alert();
	  System.out.println("Text of the alert is: "+alt.getText());
	  alt.accept();
	  
	  
	  
	  
  }
}
