package org.facebook;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown {
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		//Single value select
		WebElement drop = driver.findElement(By.xpath("//select[@id='first']"));
		Select s = new Select(drop);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("Google");
		Thread.sleep(2000);
		s.selectByVisibleText("Bing");
		Thread.sleep(2000);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++) {
			WebElement values = options.get(i);
			String text = values.getText();
			System.out.println(text);
		}
		//Multiple values select
		WebElement multiSelect = driver.findElement(By.xpath("//select[@id='second']"));
		Select s1 = new Select(multiSelect);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		WebElement first = s1.getFirstSelectedOption();
		String firstValue = first.getText();
		System.out.println(firstValue);
		
	}
}
