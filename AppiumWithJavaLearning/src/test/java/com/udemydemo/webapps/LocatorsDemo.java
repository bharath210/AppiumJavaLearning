package com.udemydemo.webapps;

import java.sql.Driver;

import org.testng.annotations.Test;

public class LocatorsDemo extends OpeningBrowser
{
	@Test
	public void test_cricbuzz()
	{
		driver.get("http://cricbuzz.com");
		driver.findElementByLinkText("Menu").click();
		driver.findElementByLinkText("Live Scores").click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
