package com.Maven;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

	public class MavenHW1 {

		public static void main(String[] args) {
		    
	        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
	          WebDriver driver = new ChromeDriver();
	          String url="https://www.google.com/";
	          driver.get(url);
	          String title  =driver.getTitle();

	          Assert.assertEquals("Google", title);
	          
}
	}
	