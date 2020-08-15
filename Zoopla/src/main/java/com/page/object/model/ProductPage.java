package com.page.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//WebElement = driver.findElement()
    //List<WebElement> =driver.findElements()	
	
	@FindBy(xpath="//input[@id='search-input-location']")
	private WebElement LocationName;
	@FindBy(xpath="//button[@id='search-submit']")
	private WebElement searchSubmitBtn;
	@FindBy(xpath="//a[@class='listing-results-price text-price']")
	private List<WebElement> homePrices;
	@FindBy(xpath="//img[@class='js-lazy-loaded']")
	private WebElement propertyLogo;
	@FindBy(xpath="(//h4[@class='ui-agent__name'])[1]")
	private WebElement agentName;
	@FindBy(xpath="(//*[@class='ui-link'])[4]")
	private WebElement agentPhoneNum;
	//@FindBy(xpath="//*[@id='header-account-panel__signed-in-link']")
	@FindBy(xpath="//*[@class='css-1mjljx5 eson0er0']//*[text()='My Zoopla']")
	private WebElement myZooplaBtn;
	//@FindBy(xpath="(//*[@class='ui-header-account-panel-description'])[5]")
	//@FindBy(xpath="//span[contains(text(),'Sign out')]")
	@FindBy(xpath="(//div[@content='Sign out'])[1]")
	private WebElement signOutBtn;
	
	  public WebElement getLocationName() {
	  return LocationName;
	}
	public WebElement getsearchBtn() {
		return searchSubmitBtn;
	}
	
	public List<WebElement> getHomePrices() {
		return homePrices;
  }
  public WebElement getPropertyLogo() {
    return propertyLogo;
  }

  public WebElement getAgentName() {
	    return agentName;
	  }
  public WebElement getAgentPhNumber() {
	    return agentPhoneNum;
	  }
  public WebElement getmyZooplaBtn() {
	    return  myZooplaBtn;
	  }
  public WebElement getsignOutBtn() {
	    return  signOutBtn;
	  }




}
