package com.generic.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.config.BaseConfig;
import com.page.object.model.ProductPage;
import com.util.Highlighter;
import com.util.TakeAppScreenShot;
import com.util.Wait;

public class HomeSelectionPage extends BaseLogin {
	
	public static void getProperty() throws Throwable {
		getLogin();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ProductPage pf = new ProductPage(driver);		
		
		new Wait().getExplicitWaitClicable(driver, pf.getLocationName());	
		pf.getLocationName().sendKeys(BaseConfig.getconfig("SearchLocation"));
		Highlighter.getcolor(driver, pf.getLocationName());
		Highlighter.getcolor(driver, pf.getsearchBtn(), "blue");
		TakeAppScreenShot.captureScreenShot(driver, "Search City");
		pf.getsearchBtn().click();
		
		String[] prices1;
		List<Integer> intprice = new ArrayList<>();
		for(int i = 0; i<pf.getHomePrices().size(); i++) {
		
	    prices1= pf.getHomePrices().get(i).getText().split(" ");
	    intprice.add(Integer.parseInt(prices1[0].replace("£","").replace(",","").trim()));
		
	}
		System.out.println("House prices =" +intprice);
		Collections.sort(intprice);
		System.out.println("House prices sorted Asc ="+intprice );
		Collections.reverse(intprice);
		System.out.println("House prices sorted Des ="+intprice );
		
		//select 5th property
		//Wait.getExplicitWaitClicable(driver, pf.getHomePrices().get(4));
		//Wait.getExplicitWaitVisible(driver, pf.getHomePrices().get(4));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", pf.getHomePrices().get(4));
	   // pf.getHomePrices().get(4).click();
	    //TakeAppScreenShot.captureScreenShot(driver," selectedproperty");
	    
	//    Wait.getExplicitWaitClicable(driver, pf.getPropertyLogo());
	    Wait.getExplicitWaitVisible(driver, pf.getAgentName());
	    
	    if(pf.getPropertyLogo().isDisplayed()) {
			System.out.println("Logo is present");
		} else {
			System.out.println("Logo is not present");
		} 
		
	   //Agent Name
	   // Wait.getExplicitWaitVisible(driver, pf.getAgentName());
	    System.out.println("Agent name is=" +pf.getAgentName().getText());
	
         //Agent phNumber
      System.out.println("Agent PhNumber=" +pf.getAgentPhNumber().getText());
   //   TakeAppScreenShot.captureScreenShot(driver," AgentInfo");
	   
      
         // sign out
      Thread.sleep(5000);
      Actions signOut = new Actions(driver);
	 // pf.getmyZooplaBtn();
	signOut.moveToElement(pf.getmyZooplaBtn()).build().perform();
	Highlighter.getcolor(driver, pf.getmyZooplaBtn(), "green");
	signOut.moveToElement(pf.getsignOutBtn()).build().perform();
	Highlighter.getcolor(driver, pf.getsignOutBtn(), "purpale");
	TakeAppScreenShot.captureScreenShot(driver, "SignOut");
	pf.getsignOutBtn().click();
	driver.quit();
	}
	public static void main(String[] args) throws Throwable {
		getProperty();
	}
   }
	

	




