package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriver {
	static WebDriver driver;
	
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RIESH\\eclipse-workspace\\SeleniumTask\\src\\main\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);		
	}
	
	public static void Maximize(){
		driver.manage().window().maximize();
	}
	
	public static void Inputs(WebElement element, String value){
		element.clear();
		element.sendKeys(value);
	}
	public static void close() {
		driver.close();
	}

}
