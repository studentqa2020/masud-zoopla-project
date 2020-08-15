package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;
import com.generic.code.HomeSelectionPage;

public class BasicAnnotationWithZoopla {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Throwable {
       driver=BaseLogin.getLogin();
	}
	
	@Test
	public void test() throws Throwable {
		HomeSelectionPage.getProperty();
	}
     @AfterTest
     public void teardown() {
	    driver.quit();
     }
  
}
