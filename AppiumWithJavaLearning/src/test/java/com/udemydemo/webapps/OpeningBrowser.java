package com.udemydemo.webapps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpeningBrowser 
{
	AndroidDriver<WebElement> driver;
	@BeforeTest
	public void openChrome() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy On5");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
