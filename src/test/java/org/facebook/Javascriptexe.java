package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexe {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); //upcasting
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		JavascriptExecutor js = (JavascriptExecutor)driver; //downcasting
		js.executeScript("arguments[0].setAttribute('value','abinaya')",user,password);
		js.executeScript("arguments[1].setAttribute('value','12345')", user,password);
		js.executeScript("arguments[1].setAttribute('style','background:pink;border:2px solid green')", user,password);
		
		js.executeScript("arguments[0].click()",login);
		Object getEmail = js.executeScript("return.arguments[0].getAttribute('email')",user,password);
		System.out.println("UserName "+getEmail);
		
		WebElement scrollDown = driver.findElement(By.xpath("//a[text()='Help']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", user);
		
	}
}
