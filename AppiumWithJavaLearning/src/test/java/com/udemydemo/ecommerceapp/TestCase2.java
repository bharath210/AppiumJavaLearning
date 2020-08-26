package com.udemydemo.ecommerceapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchStoreApp
{
	@Test
	public void test_toastMessage()
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Brazil\").instance(0))").click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		String msg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(msg);

		Assert.assertTrue(msg.contains("enter your name"));
	}

}
