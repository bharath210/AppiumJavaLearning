package com.udemydemo.ecommerceapp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchStoreApp 
{
	AndroidDriver<WebElement> driver;
	@BeforeTest
	public void launchApp() throws MalformedURLException
	{
		File appDir = new File("src");
		File app = new File(appDir,"General-Store.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy On5");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}
	
	public void login(String country,String name)
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text("+'"'+country+'"'+").instance(0))").click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys(name);
		driver.hideKeyboard();

		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	}

}
