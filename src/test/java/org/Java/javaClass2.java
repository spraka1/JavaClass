package org.Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaClass2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		
	}
}
