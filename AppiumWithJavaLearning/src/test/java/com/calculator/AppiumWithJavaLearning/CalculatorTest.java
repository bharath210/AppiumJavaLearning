package com.calculator.AppiumWithJavaLearning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTest
{
	public AndroidDriver<MobileElement> driver;
	@BeforeTest
	public void launchApp() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy On5");
		cap.setCapability("udid", "420053709b9133a5");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
	
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url,cap);
	}
	@AfterTest
	public void closeApp()
	{
	
	}
	@Test
	public void test_add()
	{
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal")).click();
		String act_res = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc")).getText();
		String exp_res = "5";
		Assert.assertEquals(exp_res, act_res);
		System.out.println(act_res);
	}
	@Test
	public void test_sub()
	{
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("3");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("0");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Plus");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Backspace");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Minus");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("2");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("0");
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Equal");
		el9.click();
		
		String exp_res = "10";
		String act_res = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc")).getText();
		Assert.assertEquals(exp_res, act_res);
		System.out.println(act_res);
	}
}
