package agrautomation.appiumbasics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerceTest1 extends BaseTest{
	
	@Test
	public void FillForm() {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("User Name");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.androidsample.generalstore:id/radioMale\")"));
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		
		
		
	}

}
