package com.udemydemo.navtiveapps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsAppiumDemo extends OpeningApp
{
	@Test
	public void test_wifiSettings() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hi Bharath");
		Thread.sleep(2000);
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
	}

}
