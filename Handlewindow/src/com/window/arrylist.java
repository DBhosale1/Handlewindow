package com.window;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class arrylist {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("parent window id :"+parent);
		
		Set<String> allwindow=driver.getWindowHandles();
		
		ArrayList<String> al= new ArrayList<>(allwindow);
		
		
		driver.switchTo().window(al.get(2));
		driver.close();
		
//		driver.switchTo().window(al.get(1));
//		
//		driver.close();
//		
		driver.switchTo().window(al.get(1));
		driver.close();
		
		System.out.println("Title id:"+driver.getTitle());
		
	}

}
