package com.udemydemo.navtiveapps;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class TouchActionsDemo extends OpeningApp
{
	@Test
	public void test_tap()
	{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		MobileElement el_expandable = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		
		TouchAction act = new TouchAction<>(driver);
		
		act.tap(tapOptions().withElement(element(el_expandable))).perform();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		
		MobileElement el_peopleName = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		LongPressOptions lpo = new LongPressOptions();
		act.longPress(lpo.longPressOptions().withElement(element(el_peopleName)).withDuration(ofSeconds(2))).release().perform();
		
		String text = driver.findElementByAndroidUIAutomator("text(\"Sample action\")").getText();
		System.out.println(text);
		Assert.assertEquals("Sample action", text);
		
	}

}
