package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void getExplicitWaitClicable(WebDriver driver, WebElement element) {

		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void getExplicitWaitClicable(WebDriver driver, By locator) {

		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.elementToBeClickable(locator));
	}

/*	public static void getExplicitWaitForNumber(WebDriver driver,By locator) {

		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, 0));
	}
	*/
	public static void getExplicitWaitVisible(WebDriver driver,WebElement element) {

		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.visibilityOf(element));
	}
	public static void getExplicitWaitVisible(WebDriver driver,By locator) {

		WebDriverWait obj = new WebDriverWait(driver, 30);
		obj.until(ExpectedConditions.visibilityOfElementLocated(locator));		
		}
//	public  static void getExplicitWaitVisible(WebDriver driver, WebElement element){
//		  
//		 WebDriverWait wait = new WebDriverWait(driver, 30);
//		 wait.until(ExpectedConditions.v)

}

