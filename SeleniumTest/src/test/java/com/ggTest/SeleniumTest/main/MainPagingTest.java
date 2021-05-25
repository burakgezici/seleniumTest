package com.ggTest.SeleniumTest.main;

import com.ggTest.SeleniumTest.Log4j;
import com.ggTest.SeleniumTest.fixProperty.ValuesGG;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainPagingTest {

	 static WebDriver webDrivers=null;


	    @BeforeAll
	    public void setUp(){

	        System.setProperty("webdriver.chrome.driver","chromeDriver/chromedriver.exe");
	        ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.addArguments("start-maximized");
	        chromeOptions.addArguments("disable-popup-blocking");
	        setWebDriver(new ChromeDriver(chromeOptions));
	        getWebDriver().navigate().to(ValuesGG.LinkAdress);
	    }
	    public static WebDriver getWebDriver() {

	        return webDrivers;
	    }
	    public static void setWebDriver(WebDriver webDriver) {

	        MainPagingTest.webDrivers = webDriver;
	    }
	    public void connectDown(){
	        getWebDriver().quit();
	    }
	    
}
