package generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;

public class Utility {
	
	public static void scrollUp(AppiumDriver driver, WebElement pagearea)
	{
		driver.executeScript("mobile: scrollGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "up", "percent", 0.75));
	}
	
	public static void scrollDownToCount(AppiumDriver driver, WebElement pagearea, int count)
	{
		for(int i=1; i<=count; i++)
		{
			driver.executeScript("mobile: scrollGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "down", "percent", 0.75));
		}
	}
	
	public static void scrollUpToCount(AppiumDriver driver, WebElement pagearea, int count)
	{
		for(int i=1; i<=count; i++)
		{
			driver.executeScript("mobile: scrollGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "up", "percent", 0.75));
		}
	}
	
	public static void scrollDown(AppiumDriver driver, WebElement pagearea)
	{
		driver.executeScript("mobile: scrollGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "down", "percent", 0.75));
	}
	
	public static void scrollLeft(AppiumDriver driver, WebElement pagearea)
	{
		driver.executeScript("mobile: scrollGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "left", "percent", 0.75));
	}
	
	public static void scrollRight(AppiumDriver driver, WebElement pagearea)
	{
		driver.executeScript("mobile: scrollGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "right", "percent", 0.75));
	}
	
	public static void swipeLeft(AppiumDriver driver, WebElement pagearea)
	{
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "left", "percent", 0.75));
	}
	
	public static void swipeRight(AppiumDriver driver, WebElement pagearea)
	{
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "right", "percent", 0.75));
	}
	
	public static void swipeUp(AppiumDriver driver, WebElement pagearea)
	{
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "up", "percent", 0.75));
	}
	
	public static void swipeDown(AppiumDriver driver, WebElement pagearea)
	{
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement)pagearea).getId(), "direction", "down", "percent", 0.75));
	}
	
	public static void takeScreenshot(AppiumDriver driver)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"//Screenshots//APIDemos"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}
	
	
}
