package org.facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTest {
	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); //upcasting
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		List<WebElement> table = driver.findElements(By.tagName("table"));
		for(int i=0;i<table.size();i++) {
			WebElement ttable = table.get(i);
			WebElement tbody = ttable.findElement(By.tagName("tbody"));
			List <WebElement> trows = tbody.findElements(By.tagName("tr"));
			for(int j=0;j<trows.size();j++) {
				WebElement row = trows.get(j);
				List<WebElement> tdata = row.findElements(By.tagName("td"));
				for(int k=0;k<tdata.size();k++) {
					WebElement td = tdata.get(k);
					String text = td.getText();
					System.out.println(text);
				}
			}
		}
		
	}
}
