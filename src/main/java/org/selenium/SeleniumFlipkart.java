package org.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumFlipkart extends Excel {
	
	public static void main(String[] args) throws Throwable  {
		
		String url = "https://www.flipkart.com";
		Excel.setCellData("value", 0, 0, "Names");
		SeleniumDriver.launch(url);
		SeleniumDriver.Maximize();		
		Thread.sleep(2000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//div[@class='_2QfC02']/button[contains(text(),'✕')]"));
		loginbutton.click();

		WebElement searchWord = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		SeleniumDriver.Inputs(searchWord, "redmi note 9 pro");
		Thread.sleep(2000);
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();
		
		Thread.sleep(10000);
		
		List<WebElement> nameList = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_4rR01T']"));
		for (int i = 0; i < nameList.size(); i++) {
			WebElement eachHeading = nameList.get(i);
			String headingText = eachHeading.getText();
			System.out.println(headingText);
			Excel.setCellData("value", i, 1, headingText);	
		}
		System.out.println("Updated in excel Sheet Succesfully");
		driver.close();
	}

}
