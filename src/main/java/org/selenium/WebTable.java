package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable extends SeleniumDriver {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/p/demo-selenium-practice.html";
		SeleniumDriver.launch(url);
		SeleniumDriver.Maximize();

		List<WebElement> table = driver.findElements(By.tagName("table"));
			WebElement tableRow = table.get( table.size()-2);
			//			System.out.println("stage : 1");
			//			System.out.println(tableRow.getText());
			List<WebElement> iRow = tableRow.findElements(By.tagName("tr"));
			WebElement row = iRow.get(iRow.size()-2);
			//				System.out.println("stage : 2");
			//				System.out.println(row.getText());
			List<WebElement> iData = row.findElements(By.tagName("td"));
			for (int i = 0; i <iData.size(); i++) {
				WebElement data = iData.get(i);
				String text = data .getText();
				if (text.equals("Yoshi Tannamuri")) {
					System.out.println("Expected Text : "+text);
//					SeleniumDriver.close();
				}
			}
		}
	}
