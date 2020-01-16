package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserTest {
	@Test
	public void test() {
		//WebDriver driver =new HtmlUnitDriver();
	      WebDriver driver;
	      WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		System.out.println("page title as : "+driver.getTitle());
		System.out.println("currebt url ; "+driver.getCurrentUrl());
	}
	}

