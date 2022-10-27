package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends SeleniumDriver {
	public static void main(String[] args) throws Throwable {
		String url = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		SeleniumDriver.launch(url);
		SeleniumDriver.Maximize();
		
		List<WebElement> selectors = driver.findElements(By.tagName("select"));
		System.out.println(selectors.size());

//		WebElement single = driver.findElement(By.xpath("//select[@id='first']"));
//		WebElement multipleDrop = driver.findElement(By.xpath("//select[@id='second']"));
//		
//		Select s = new Select(single); 
//		s.selectByIndex(0);
//		Thread.sleep(2000);
//		s.selectByValue("Google");
//		Thread.sleep(2000);
//		s.selectByVisibleText("Yahoo");
//		Thread.sleep(2000);
//		Boolean result = s.isMultiple();
//		System.out.println(result);
//		
//		Select s2 = new Select(multipleDrop);
//		s2.selectByIndex(0);
//		s2.selectByIndex(2);
//		s2.selectByIndex(1);
//		
//		s2.deselectByIndex(0);
//		System.out.println("index de-selected");
//		List<WebElement> all = s2.getAllSelectedOptions();
//		for (int i = 0; i < all.size(); i++) {
//			WebElement option = all.get(i);
//			String text = option.getText();
//			System.out.println(text);
////		}
//		WebElement first = s2.getFirstSelectedOption();
//		System.out.println(first.getText());	
	}
}
