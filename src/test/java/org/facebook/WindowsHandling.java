package org.facebook;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws Exception{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://flipkart.com/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("realme");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])")).click();
		driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
		String parent = driver.getWindowHandle();
//		driver.switchTo().window(parent);
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		for(String s: child) {
			if(!parent.equals(s)) {
				driver.switchTo().window(s);
			}
		}
	}
}
