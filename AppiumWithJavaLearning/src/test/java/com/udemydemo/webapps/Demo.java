package com.udemydemo.webapps;

import org.testng.annotations.Test;

public class Demo extends OpeningBrowser
{
	@Test
	public void test()
	{
		driver.get("http://google.com");
		driver.findElementByXPath("//input[@name='q']").sendKeys("Appium");
	}

}
