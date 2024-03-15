package org.facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeTest {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); //upcasting
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abinaya@gmail.com");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
//		driver.switchTo().frame(frame);
//		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for(int i=0;i<frames.size();i++) {
			try {
				driver.switchTo().frame(i);
				driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
			}
			catch(Exception e) {
				System.out.println("Image Mismatched");
				driver.switchTo().parentFrame();
			}
		}
		
		
	}
	
}
