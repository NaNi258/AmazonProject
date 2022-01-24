package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliDemo {
public static void main(String[] args) throws FindFailed {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
	
	driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
	
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nithiya");
	driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("nalini");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kumar");
	
	
	driver.findElement(By.xpath("//input[@id='photofile']")).click();
	
	String filepath="C:\\Users\\nalinis\\Pictures\\Saved Pictures";
	//String inputfilePath="C:\\Users\\nalinis\\Documents\\testcase\\";
	Screen s=new Screen();
	Pattern filechoosen=new Pattern(filepath+"filename.PNG");
	Pattern close=new Pattern(filepath+"open.PNG");
	
	s.wait(filechoosen,20);
	s.type(filechoosen,filepath+"rose.PNG");
	s.click(close);
	
}
}
