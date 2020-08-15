package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;
import com.generic.code.HomeSelectionPage;

public class BasicAnnotationWithZooplaTest {

	WebDriver driver;

   @BeforeTest
   public void setup() throws Throwable  {
	WebDriver driver = BaseLogin.getLogin();
   }
   @Test
	public void test() throws Throwable {
	   HomeSelectionPage obj = new HomeSelectionPage();
	   new HomeSelectionPage().getProperty();
   }
  @AfterTest
  public void teardown() {
	   driver.quit();
  }
}

