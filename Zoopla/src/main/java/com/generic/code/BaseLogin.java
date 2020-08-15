package com.generic.code;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.config.BaseConfig;
import com.page.object.model.LoginPage;
import com.util.Highlighter;
import com.util.TakeAppScreenShot;
import com.util.Wait;

public class BaseLogin {

	protected static WebDriver driver;
	
	public static WebDriver getLogin() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(BaseConfig.getconfig("URL"));
	
		LoginPage login =new LoginPage(driver);
		System.out.println(driver.getTitle());
		
		login.getClickAllcookies().click();
		login.getLogin().click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Wait.getExplicitWaitClicable(driver, login.getEmail());
		new Highlighter().getcolor(driver, login.getEmail(), "yellow");
		login.getEmail().sendKeys(BaseConfig.getconfig("email"));	
		
		new Highlighter().getcolor(driver, login.getPass(),"black");
		login.getPass().sendKeys(BaseConfig.getconfig("pass"));
		TakeAppScreenShot.captureScreenShot(driver, "Login success");
		
		login.getSubmit().click();		
		System.out.println(driver.getTitle());
		//driver.quit();
		return driver;
	
	}
}
