package com.udemydemo.ecommerceapp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends LaunchStoreApp
{
	@Test
	public void test_SearchProduct()
	{
		login("Algeria", "Arya");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\").instance(0)).scrollIntoView(new UiSelector().text(\"Jordan Lift Off\").instance(0))");
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productImage")).size();
		System.out.println(count);
		for(int i = 0; i < count; i++)
		{
			String product = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			if(product.equalsIgnoreCase("Jordan Lift Off"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
	
			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		boolean item = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\").instance(0)).scrollIntoView(new UiSelector().text(\"Jordan Lift Off\").instance(0))").isDisplayed();
		Assert.assertTrue(item);
		System.out.println("Successfully added");
	}

}
