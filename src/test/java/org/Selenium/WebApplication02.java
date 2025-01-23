package org.Selenium;

import java.util.List;

import org.Utility.helperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class WebApplication02 extends helperClass {

	public static void main(String[] args) {
		
		System.out.println("Demo QA Page");
		
		chromeBroweserLaunch();
		webPageLauch("https://seleniumbase.io/demo_page/");
		
		webApplication01 web = new webApplication01(driver);
		
		
		WebElement firstName = web.getFirstName();
		firstName.sendKeys("FirstName");
		
		web.getPreFilledText().clear();
		web.getPreFilledText().sendKeys("New texts");
		web.getPlaceHolderText().sendKeys("Place Holder texts");
		web.getMyTextArea().sendKeys("My Text Area texts");
		String text = web.getReadOnlyText().getText();
		System.out.println(text);
		try {
			web.getRangeSelect().click();
		} catch (Exception e) {
			System.out.println("Range is not selected");
		}
		
		String text2 = web.getProgressLabel().getText();
		System.out.println(text2);
		
		
		List<WebElement> elements1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (int i = 0; i < elements1.size(); i++) {
			
			WebElement webElement = elements1.get(i);
			webElement.click();
			
		}
		
		List<WebElement> elements2 = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (int i = 0; i < elements2.size(); i++) {
			
			WebElement radio = elements2.get(i);
			radio.click();
			
		}
		
		Select select = new Select(web.getSelectDropdown());
		List<WebElement> options = select.getOptions();
		int size = options.size();
		for (int i=0;i<size;i++) {
			
			select.selectByIndex(i);
		
			
		}
		
		WebElement FrameText = web.getTextFrame();
		driver.switchTo().frame(FrameText);
		String text3 = web.getiFrameText().getText();
		System.out.println(text3);
		
		
		
		
	}}
