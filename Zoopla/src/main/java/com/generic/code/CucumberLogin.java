package com.generic.code;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.config.BaseConfig;
import com.page.object.model.LoginPage;
import com.util.Highlighter;
import com.util.TakeAppScreenShot;
import com.util.Wait;

public class CucumberLogin {
	
	protected static WebDriver driver;
	protected static LoginPage login;
	
	public static WebDriver setup() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		
	}
	
	public static void getUrl(WebDriver driver) throws Throwable {
		driver.get(BaseConfig.getconfig("URL"));		
	}
	
	public static void acceptCoockies(WebDriver driver) {
		login =new LoginPage(driver);
		System.out.println(driver.getTitle());
		login.getClickAllcookies().click();
	}
	
	public static void clickSignIn(WebDriver driver) {
		login.getLogin().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());	
		
	}
	public static void sendUserName(WebDriver driver) throws Throwable {
		Wait.getExplicitWaitClicable(driver, login.getEmail());
		new Highlighter().getcolor(driver, login.getEmail(), "yellow");
		login.getEmail().sendKeys(BaseConfig.getconfig("email"));
	}
	public static void sendPassword(WebDriver driver) throws Throwable {
	new Highlighter().getcolor(driver, login.getPass(),"black");
	login.getPass().sendKeys(BaseConfig.getconfig("pass"));
	TakeAppScreenShot.captureScreenShot(driver, "Login success");
	
	}
		
	public static void clickSubmit(WebDriver driver) {
		login.getSubmit().click();	
		
	}
	public static void pageLogIn(WebDriver driver) {
		System.out.println(driver.getTitle());
	}
	
}
