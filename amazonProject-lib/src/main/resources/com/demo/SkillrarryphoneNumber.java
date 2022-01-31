package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillrarryphoneNumber {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Set<String> a = driver.getWindowHandles();
		List<String> win=new ArrayList<>(a);
		driver.switchTo().window(win.get(1));
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		String actual_phone = driver.findElement(By.xpath("//h5[text()='Contact Us']/parent::div/descendant::li[1]/child::a")).getText();
		System.out.println(actual_phone);
		String expected_phone="USA (HQ) +1-914-458-4254";
		Assert.assertEquals(actual_phone, expected_phone);

		driver.quit();



	}
}
