package agrautomation.appiumbasics;


import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;



public class AppiumBasics extends BaseTest {
	
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
	
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
//		driver.findElement(AppiumBy.androidUIAutomator(new UiSelector().className("android.widget.RelativeLayout").instance(1)));
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String titleName = driver.findElement(By.id("android:id/alertTitile")).getText();
		Assert.assertEquals(titleName, "WiFi Settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("WiFi ctOS");
//		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
		driver.findElements(By.className("android.widget.Button")).get(1).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
