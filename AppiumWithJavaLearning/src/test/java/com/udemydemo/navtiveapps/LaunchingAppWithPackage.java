package com.udemydemo.navtiveapps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchingAppWithPackage 
{

	@Test
	public void test() throws MalformedURLException 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy On5");
		cap.setCapability(MobileCapabilityType.UDID, "420053709b9133a5");
		cap.setCapability(MobileCapabilityType.PLATFORM, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability("appPackage","com.instagram.android");
		cap.setCapability("appActivity","com.instagram.mainactivity.LauncherActivity");

		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
