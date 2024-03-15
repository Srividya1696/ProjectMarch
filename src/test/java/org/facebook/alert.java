package org.facebook;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alert {
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//Simple Alert
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		
		//Confirm Alert
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]")).click();
		Thread.sleep(2000);
		a.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		Thread.sleep(2000);
		String text = a.getText();
		System.out.println(text);
		a.sendKeys("Abinaya");
		a.accept();
	}
}
