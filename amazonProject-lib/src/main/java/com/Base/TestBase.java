package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {


	public static Properties prop;
	public static XSSFSheet sheet;
	public static WebDriver driver;
	public TestBase() {
		prop=new Properties();
		FileInputStream fls;
		XSSFWorkbook book;
		try {
			fls = new FileInputStream(new File("C:\\Users\\nalinis\\Documents\\testcase\\amazon.xlsx"));
			book = new XSSFWorkbook(fls);
			sheet=book.getSheetAt(0);
		} catch (Exception e) {
			e.printStackTrace();
		}




	}
	public static void initialization() {
		String browser = sheet.getRow(0).getCell(1).getStringCellValue();
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.get(sheet.getRow(2).getCell(4).getStringCellValue());
		driver.manage().window().maximize();
	}
	public static void teardown() {
		driver.close();
	}
}
