package com.udemydemo.navtiveapps;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class SwipeAction extends OpeningApp
{
	@Test
	public void test_swipe()
	{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		MobileElement el1 = driver.findElementByXPath("//*[@content-desc='15']");
		MobileElement el2 = driver.findElementByXPath("//*[@content-desc='45']");
		TouchAction act = new TouchAction(driver);

		act.longPress(longPressOptions().withElement(element(el1)).withDuration(ofSeconds(2))).moveTo(element(el2)).release().perform();
	
	}

}
