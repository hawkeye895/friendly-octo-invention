package com.hawk895.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hawk895.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void LoginAsBm() throws InterruptedException {
		log.debug("Start test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("addCus"))),"Login not successfull");
		
		log.debug("End test");
	}

}
