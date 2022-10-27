package org.selenium;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SetcTicket extends SeleniumDriver {
	public static void main(String[] args) throws IOException, Throwable {
		String url = "https://www.tnstc.in/home.html";
		SeleniumDriver.launch(url);
		SeleniumDriver.Maximize();
		Thread.sleep(3000);
		
		WebElement fromePlace = driver.findElement(By.xpath("//input[@id='matchStartPlace']"));
		SeleniumDriver.Inputs(fromePlace, "Ch");
		Robot r = new Robot();
//		r = new Robot();
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement toPlace = driver.findElement(By.id("matchEndPlace"));
		SeleniumDriver.Inputs(toPlace, "tri");
		Thread.sleep(2000);
		
		
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement journeyDate = driver.findElement(By.id("txtdeptDateOtrip"));
		journeyDate.click();
		WebElement journeyDatPick = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//a[contains(text(),'24')]"));
		journeyDatPick.click();
		Thread.sleep(2000);
		
		WebElement journeyTime = driver.findElement(By.id("selectOnwardTimeSlab"));
		Select s = new Select(journeyTime);
		Thread.sleep(1000);
		s.selectByValue("20:01-23:59");
		Thread.sleep(1000);
		WebElement persons = driver.findElement(By.id("txtAdultMales"));
		SeleniumDriver.Inputs(persons, "2");	
		Thread.sleep(1000);
		
		WebElement busService = driver.findElement(By.id("selectClass"));
		Select s2 = new Select(busService);
		Thread.sleep(1000);
		s2.selectByValue("141");
		Thread.sleep(1000);
				
		TakesScreenshot capture = (TakesScreenshot)driver;
		File source = capture.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\RIESH\\eclipse-workspace\\SeleniumTask\\src\\main\\resources\\screenshot_1");
		FileUtils.copyFile(source, destination);
		Thread.sleep(3000);
		System.out.println("Screenshot Captured_1");
		
		WebElement search = driver.findElement(By.xpath("//div[@class='btnTxt']/a[@class='btnTxt']"));
		search.click();
		Thread.sleep(3000);
		
		TakesScreenshot capture2 = (TakesScreenshot)driver;
		File source2 = capture2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\RIESH\\eclipse-workspace\\SeleniumTask\\src\\main\\resources\\screenshot_2");
		FileUtils.copyFile(source2, destination2);
		Thread.sleep(2000);
		System.out.println("Screenshot Captured_2");
		
		driver.findElement(By.xpath("//table//tbody//tr//td[@class='smalltext']//a[@class='ajax']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot capture3 = (TakesScreenshot)driver;
		File source3 = capture3.getScreenshotAs(OutputType.FILE);
		File destination3 = new File("C:\\Users\\RIESH\\eclipse-workspace\\SeleniumTask\\src\\main\\resources\\screenshot_3");
		FileUtils.copyFile(source3, destination3);
		Thread.sleep(2000);
		System.out.println("Screenshot Captured_3");
		
		WebElement availableSeats = driver.findElement(By.xpath("(//form[@name='advanceBookingActionForm']//table[@cellpadding='2']/tbody//tr//table[@id='table5']//div/strong/span[@class='button'])[1]"));
		String Available = availableSeats.getText();
		System.out.println("Available Seats :  "+Available);
		
		WebElement amount = driver.findElement(By.xpath("(//form[@name='advanceBookingActionForm']//table[@cellpadding='2']/tbody//tr//table[@id='table5']//div/strong/span[@class='button'])[2]"));
		String TicketFare = amount.getText();
		System.out.println("Ticket Fare :  "+TicketFare);
		Thread.sleep(120000);
		
		Alert popup = driver.switchTo().alert();
		popup.accept();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current_Url : "+currentUrl);
		if (url.equals(currentUrl) ) {
			System.out.println("Alert popup Closed through Alert Class");
			driver.close();		
		}	
	}
}
