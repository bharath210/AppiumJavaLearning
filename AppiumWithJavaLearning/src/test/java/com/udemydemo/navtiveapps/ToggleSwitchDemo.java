package com.udemydemo.navtiveapps;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ToggleSwitchDemo extends OpeningApp
{
	@Test
	public void test_toggleOnOff() throws InterruptedException
	{
		driver.findElementByAndroidUIAutomator("text(\"Preference\")").click();
		driver.findElementByAndroidUIAutomator("text(\"9. Switch\")").click();
//		Point point = driver.findElementsByClassName("android.widget.Switch").get(0).getLocation();
//		TouchAction action = new TouchAction(driver);
//		action.tap(PointOption.point(point.x+20, point.y+30)).perform();
//		Thread.sleep(3000);
//		action.tap(PointOption.point(point.x+80, point.y+30)).perform();
		driver.findElementsByClassName("android.widget.Switch").get(0).click();
		Thread.sleep(2000);
		driver.findElementsByClassName("android.widget.Switch").get(1).click();
	}

}
