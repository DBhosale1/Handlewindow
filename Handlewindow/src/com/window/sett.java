package com.window;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sett {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parent= driver.getWindowHandle();
		
		
		System.out.print("Parent window id :"+parent);
		
		
		Set<String> allhandles=driver.getWindowHandles();
		
		int count=allhandles.size();
		
		System.out.println("Total window"+count);
		for(String child : allhandles)
		{
			
			if(!parent.equalsIgnoreCase(child)){

				driver.switchTo().window(child);
				
				System.out.println("child window title :"+driver.getTitle());
				
				Thread.sleep(300);
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parent);
		System.out.println("Parent window title is:"+driver.getTitle());
		driver.close();
	}
}
