package com.udemydemo.navtiveapps;

import org.testng.annotations.Test;

public class AndroidUIAutomatorDemo extends OpeningApp
{
	@Test
	public void test_views()
	{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		int x = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		System.out.println(x);
	}

}
