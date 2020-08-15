
package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	private WebElement ClickAllCookies;
	//@FindBy(xpath ="//*[@class='button button--tertiary-dark account-link__text']")
	//@FindBy(xpath="//*[@class='css-fa8dvy e11d441i1']")
	@FindBy(xpath="(//*[text()='Sign in'])[1]")
	private WebElement login;
	@FindBy(xpath = "//*[@type='email']")
	private WebElement email;
	@FindBy(xpath = "//*[@type='password']")
	private WebElement pass;
	@FindBy(xpath = "//*[@id='signin_submit']")
	private WebElement submit;
	
	
	public WebElement getClickAllcookies() {
		return ClickAllCookies;
	}
	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	
	}

}
