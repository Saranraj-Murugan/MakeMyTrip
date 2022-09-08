package com.selenium.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	static List<String> win;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MURALI\\eclipse-workspace\\MMT_BusBooking\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String windowID=driver.getWindowHandle();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(windowID);
		
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> windows = driver.getWindowHandles();
			
		for(String child:windows) 
		{
				if(!child.equalsIgnoreCase(windowID)) 
				{
				win = new ArrayList<String>();
				win.add(child);
				System.out.println(win);
				}
		}
		driver.switchTo().window(win.get(0));
		Thread.sleep(3000);
		driver.close();
}

}
