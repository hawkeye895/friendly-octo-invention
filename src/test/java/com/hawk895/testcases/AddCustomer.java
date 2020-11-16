package com.hawk895.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hawk895.base.TestBase;

public class AddCustomer extends TestBase{
	
	@Test(dataProvider="getData")
	public void addCust(String Fname, String Lname, String Postcode) {
		driver.findElement(By.xpath(OR.getProperty("addCus"))).click();
		driver.findElement(By.xpath(OR.getProperty("fname"))).sendKeys(Fname);
		driver.findElement(By.xpath(OR.getProperty("lname"))).sendKeys(Lname);
		driver.findElement(By.xpath(OR.getProperty("postcode"))).sendKeys(Postcode);
		driver.findElement(By.xpath(OR.getProperty("addCustBtn"))).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}
	
	@DataProvider
	public Object[][]getData(){
		Object[][] data = new Object[3][3];
		
		data[0][0]="Ram";
		data[0][1]="Ram";
		data[0][2]="41144";
		
		data[1][0]="Ramqa";
		data[1][1]="Ramqa";
		data[1][2]="85582";
		
		data[2][0]="Ramta";
		data[2][1]="Ramta";
		data[2][2]="96857";
		
		return data;
	}
		
}

