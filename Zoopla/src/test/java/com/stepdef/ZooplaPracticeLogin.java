package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;
import com.generic.code.CucumberLogin;
import com.util.TakeAppScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZooplaPracticeLogin {
	
	WebDriver driver;
	
	@Given("open a browser")
	public void open_a_browser() throws Throwable {
		driver = CucumberLogin.setup();
	}

	@Given("enter URL")
	public void enter_URL() throws Throwable {
	    CucumberLogin.getUrl(driver);
	}

	@Given("manage cookies")
	public void manage_cookies() {
		CucumberLogin.acceptCoockies(driver);
	   
	}

	@When("click Signin btn")	
	public void click_Signin_btn() {
		CucumberLogin.clickSignIn(driver);
	   
	}
	@When("put valid user name")
	public void put_valid_user_name() throws Throwable {
		CucumberLogin.sendUserName(driver);
	  
	}

	@When("put valid password")
	public void put_valid_password() throws Throwable {
		CucumberLogin.sendPassword(driver);
	   
	}

	@When("click submit")
	public void click_submit() {
		CucumberLogin.clickSubmit(driver);
	    
	}

	@When("user logged in")
	public void user_logged_in() {
	    CucumberLogin.pageLogIn(driver);
	}

	
	@Then("take screen shot")
	public void take_screen_shot() {
		TakeAppScreenShot.captureScreenShot(driver, "Login success");
		driver.quit();
	}

	   
}
