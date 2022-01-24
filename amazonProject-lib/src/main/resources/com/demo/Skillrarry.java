package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Skillrarry {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://skillrary.com/");
	driver.findElement(By.xpath("//ul[@class='home_menu list-unstyled list-inline']/child::li[3]")).click();
	driver.findElement(By.xpath("//ul[@class='home_menu list-unstyled list-inline']/child::li[3]/descendant::li[7]")).click();
	
	Set<String> window = driver.getWindowHandles();
	List<String> list=new ArrayList<>(window);
	driver.switchTo().window(list.get(1));
	
	WebElement course = driver.findElement(By.xpath("//a[@id='course']"));
	Actions ac=new Actions(driver);
	ac.moveToElement(course).perform();
	
	driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
	
	WebElement add_symbol = driver.findElement(By.xpath("//button[@id='add']"));
	ac.doubleClick(add_symbol).perform();
	
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();

	driver.findElement(By.xpath("//a[text()='Go to Cart']")).click();
	
	driver.findElement(By.xpath("//button[@class='btn btn-danger btn-flat cart_delete']")).click();
}
}
