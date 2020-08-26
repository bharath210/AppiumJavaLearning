package com.udemydemo.navtiveapps;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DrogAndDropDemo extends OpeningApp
{
	@Test
	public void test_dragAndDrop()
	{
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		MobileElement source = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		MobileElement destination = driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		
		TouchAction act = new TouchAction(driver);
//		act.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		act.longPress(element(source)).moveTo(element(destination)).release().perform();
	}

}
