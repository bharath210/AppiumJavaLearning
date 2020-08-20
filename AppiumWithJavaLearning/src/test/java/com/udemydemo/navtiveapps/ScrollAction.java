package com.udemydemo.navtiveapps;

import org.testng.annotations.Test;

public class ScrollAction extends OpeningApp
{
	@Test
	public void test_scroll()
	{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"Tabs\")").click();
		//driver.findElementByAndroidUIAutomator("new  UiScrollable(new UiSelector()).scorllIntoView(text(\"Tabs\"));");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Tabs\").instance(0))").click();
		
	}

}
