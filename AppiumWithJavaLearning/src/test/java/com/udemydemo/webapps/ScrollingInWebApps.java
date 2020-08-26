package com.udemydemo.webapps;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollingInWebApps extends OpeningBrowser
{
	@Test
	public void test_Scroll() throws InterruptedException
	{
		driver.get("http://cricbuzz.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		String cls = driver.findElementByXPath("//h4[text()='Top Stories']").getAttribute("class");
		Assert.assertTrue(cls.contains("header"));
	}

}
