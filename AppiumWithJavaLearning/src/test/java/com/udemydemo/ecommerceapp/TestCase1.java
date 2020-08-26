package com.udemydemo.ecommerceapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchStoreApp
{
	@Test
	public void test_fillValidDetails()
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Brazil\").instance(0))").click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("Sansa");
		driver.hideKeyboard();
		System.out.println(driver.getContext());
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		WebElement cart = driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
		Assert.assertTrue(cart.isDisplayed());
		
	}

}
