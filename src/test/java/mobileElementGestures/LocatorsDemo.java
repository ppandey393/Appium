package mobileElementGestures;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import utility.DriverUtility;

public class LocatorsDemo {
	@Test
	public void elementLocator() throws InterruptedException {

		AppiumDriver driver = DriverUtility.initAndroidSession();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators

		// accessibility id (primary locator)
		WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
		System.out.println("Text of mobileElement 1 is: " + ele1.getText());
		ele1.click();
		driver.navigate().back();
		Thread.sleep(1000);

		// xpath locator
		WebElement ele2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
		System.out.println("Text of mobileElement 2 is: " + ele2.getText());
		ele2.click();
		driver.navigate().back();
		Thread.sleep(1000);

		// class locator - - elements 1st approach
		List<WebElement> ele3 = driver.findElements(AppiumBy.className("android.widget.TextView"));
		System.out.println("Text of mobileElement 3 is: " +ele3.get(3).getText());
		ele3.get(3).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		// id locator = resource id - elements 2nd approach
		WebElement ele4 = driver.findElements(AppiumBy.id("android:id/text1")).get(3);
		System.out.println("Text of mobileElement 4 is: " +ele4.getText());
		ele4.click();
		driver.navigate().back();
		
		// UiAutomator2 locator
		WebElement ele5 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Graphics\")"));
		System.out.println("Text of mobileElement 5 is: " +ele5.getText());
		ele5.click();
		driver.navigate().back();

	}
}
