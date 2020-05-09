package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\Auxo_Laptop_Backup\\Learning\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://youtube.com");
	System.out.println(driver.getTitle());
}
}
