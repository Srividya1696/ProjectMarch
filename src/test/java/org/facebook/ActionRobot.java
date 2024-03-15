package org.facebook;
import io.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRobot {
	public static void main(String[] args)throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
//		String s = "https://www.amazon.in/";
		String s1 = "https://www.facebook.com/";
		String s2 = "https://demo.guru99.com/test/drag_drop.html";
		driver.navigate().to(s2);
//		driver.manage().window().minimize();
//		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions a = new Actions(driver);
//		a.moveToElement(mobile).click().perform();
		
		//Take Screenshot
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\HP\\eclipse-workspace\\org.facebook\\target\\pictureSS.png");
//		FileUtils.copyFile(src, des);
				
		//Drag and Drop Methods
		WebElement drag = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
		a.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		WebElement drag1 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
		WebElement drop1 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
		
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag1, drop1).build().perform();
		WebElement drag2 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[6]"));
		WebElement drop2 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[3]"));
		a.dragAndDrop(drag2, drop2).build().perform();
		WebElement drag3 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[4]"));
		WebElement drop3 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
		a.dragAndDrop(drag3, drop3).build().perform();
				
		//Action methods
//		WebElement user = driver.findElement(By.id("email"));
//		a.sendKeys(user,"abinaya467@gmailcom").build().perform();
//		a.doubleClick(user).build().perform();
//		a.contextClick(user).build().perform();
		
		//Robot methods
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
		
		
		
		
	}
	
	
}
