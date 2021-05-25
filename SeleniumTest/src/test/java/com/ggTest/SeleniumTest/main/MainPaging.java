package com.ggTest.SeleniumTest.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPaging {

	 	WebDriver driver =null;
	    WebDriverWait timing = null;

	    public MainPaging(WebDriver driver){
	        this.driver=driver;
	        this.timing= new WebDriverWait(driver,50);
	    }
	    public WebElement elementIsCheck(By element){
	        timing.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	        return driver.findElement(element);
	    }
	    public void reKey(By element, String message){
	    	elementIsCheck(element).sendKeys(message);
	    }
	    public void click (By element){
	        timing.until(ExpectedConditions.elementToBeClickable(element));
	        elementIsCheck(element).click();
	    }
	    public String getText(By element){
	        timing.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	        return elementIsCheck(element).getText();
	    }
	    public void navigateToUrl(String url){
	        driver.navigate().to(url);
	    }
}
