package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Method {
	
	public void Test() {
		System.setProperty("webdriver.chrome.driver","F:\\Auxo_Laptop_Backup\\Learning\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://youtube.com");

	}
	
	
	
}
