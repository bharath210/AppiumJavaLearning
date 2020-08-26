package com.udemydemo.navtiveapps;

import static io.appium.java_client.touch.offset.ElementOption.element;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscMethods extends OpeningApp
{
	
	@Test
	public void test_back() throws InterruptedException
	{
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.isDeviceLocked());
		System.out.println(driver.getOrientation());
		System.out.println(driver.getBatteryInfo());
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		
	}
	
}


