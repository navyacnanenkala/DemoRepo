package com.demo.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyFirstTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		driver.quit();
				
				

	}

}
