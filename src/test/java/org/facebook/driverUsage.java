package org.facebook;
import java.io.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class driverUsage {
	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\eclipse-workspace\\org.facebook\\target\\webdrivers\\msedgedriver.exe");)
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.facebook.com/");
		String s = "https://www.facebook.com/";
		driver.navigate().to(s);
		driver.manage().window().minimize();
		
		//Webdriver methods
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
////		driver.switchTo().newWindow(WindowType.TAB);
//		String currentURL = driver.getCurrentUrl();
//		System.out.println(currentURL);
//		if(s.equals(currentURL)) {
//			System.out.println("Both Url are matched");
//		}else {
//			System.err.println("Url mismatched");
//		}
		
		//WebElement locators
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("abinaya467@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Email\")]")).sendKeys("abinaya@gmailcom");
		driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		
//		WebElement user = driver.findElement(By.id("email"));
//		user.sendKeys("abinaya467@gmail.com");
//		String attribute = user.getAttribute("type");
//		System.out.println(attribute);
//		Thread.sleep(2000);
//		WebElement password = driver.findElement(By.name("pass"));
//		password.sendKeys("abinaya");
//		Thread.sleep(2000);
//		WebElement login = driver.findElement(By.linkText("Log in"));
//		login.click();
//		WebElement forgotP = driver.findElement(By.partialLinkText("Forgotten"));
//		forgotP.click();
//		List<WebElement>log = driver.findElements(By.tagName("a"));
//		for(int i=0;i<log.size();i++) {
//			WebElement text = log.get(i);
////			System.out.println(text);
//			String text2 = text.getText();
//			System.out.println(text2);
//			
//		}
}
}
