package org.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helperClass {
	
	public static WebDriver driver;
	
	public static void chromeBroweserLaunch() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();}
	
	public static void webPageLauch(String url) {
		
		driver.get(url);}
	
	
	public static void buttonClick(String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();}
	
	
	public static void fillTextBoxWithString(String xpath , String value) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);}
	
	public static void fillTextBoxWithInteger(String xpath , CharSequence[] value) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);}
}
