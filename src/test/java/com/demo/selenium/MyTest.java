package com.demo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class MyTest {
	
  public String baseUrl = "http://demo.guru99.com/test/newtours/";
  String driverPath = "C:\\Users\\routsu\\Documents\\DevTools\\selenium\\Drivers\\geckodriver.exe";
  public WebDriver driver ; 
/*  
  @Test
  public void verifyHomepageTitle() {
	  System.out.println("Running......");
	  System.out.println("launching firefox browser");
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      AssertJUnit.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }*/
  
  @Test
  public void testOne() {  
	  
	  System.out.println("Test 1 passed......"); 
  }
  
  
  @Test
  public void testTwo() {  
	  
	  System.out.println("Test 2 passed......"); 
  }
  
  @Test
  public void testThree() {  
	  
	  System.out.println("Test 3 passed......"); 
  }
    
	  
}
