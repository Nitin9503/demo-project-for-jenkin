package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hedlesstest {

	
@Test
public void test() {
	//WebDriver driver =new HtmlUnitDriver();
      WebDriver driver;
      
   driver = new HtmlUnitDriver();
	driver.get("http://www.noblr.com");
	driver.manage().window().maximize();
	System.out.println("page title as : "+driver.getTitle());
	System.out.println("currebt url ; "+driver.getCurrentUrl());
}
}
