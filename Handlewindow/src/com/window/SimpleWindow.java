package com.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleWindow {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> itr =s.iterator();		
		
		while(itr.hasNext()){
			
			String childframe=itr.next();
			
			if(!parent.equals(childframe)){
			System.out.println(driver.switchTo().window(childframe).getTitle());
		
			driver.close();
		}
		
		}
		driver.switchTo().window(parent);
	}

}
