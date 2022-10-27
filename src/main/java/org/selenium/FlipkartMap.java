package org.selenium;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class FlipkartMap extends SeleniumDriver{
	public static void main(String[] args) throws Throwable  {
		
		String url = "https://www.flipkart.com";
		Excel.setCellData("value", 0, 0, "Names");
		SeleniumDriver.launch(url);
		SeleniumDriver.Maximize();		
		Thread.sleep(2000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//div[@class='_2QfC02']/button[contains(text(),'✕')]"));
		loginbutton.click();

		WebElement searchWord = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		SeleniumDriver.Inputs(searchWord, "redmi");
		Thread.sleep(2000);
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();
		
		Thread.sleep(10000);
		Map<String, String> ex = new HashMap<String, String>();
		List<WebElement> nameList = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_4rR01T']"));		
		for (int i = 0; i < nameList.size(); i++) {
			WebElement eachHeading = nameList.get(i);
			String headingText = eachHeading.getText();
			List<WebElement> price = driver.findElements(By.xpath("(//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_30jeq3 _1_WHN1'])"));
			for (int j = i; j == i; j++) {
				WebElement pricelist = price.get(j);
				String priceListText = pricelist.getText();
				
				ex.put(headingText, priceListText);
				Set<Entry<String,String>> s = ex.entrySet();
				for(Entry<String, String> x : ex.entrySet()){
					System.out.println(x);
				}
			}
 
		}
		driver.close();
	}
}
