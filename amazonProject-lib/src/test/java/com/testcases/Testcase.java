package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pages.Homepage;

public class Testcase extends TestBase {

	public Testcase() {
		super();
	}



	Homepage hp;
	@BeforeClass
	public void setup() {
		initialization();
		hp=new Homepage();
	}



	//checking the fashion page title 01
	@Test(enabled = false)
	public void validateFashionTitile() {
		hp.clicksOnFashionButton();
		String actual = hp.title();
		String expectedTitile = sheet.getRow(5).getCell(4).getStringCellValue();
		Assert.assertEquals(actual, expectedTitile);
		System.out.println("the actual title is same as the expected title");
	}



	//checking the number of category of the fashion page
	@Test(enabled=false)
	public void validateTotalCategory() {
		hp.clicksOnFashionButton();
		String actual = hp.numberofContent();
		String expectedTotal = sheet.getRow(8).getCell(4).getStringCellValue();
		Assert.assertEquals(actual, expectedTotal);
		System.out.println("The actual number of category is same as expected");



	}



	//checking the women category page title page
	@Test(enabled=false)
	public void validateTitle() {
		hp.clicksOnFashionButton();
		hp.clicksOnWomenCatogoryButton();
		String actual = hp.title();
		String expectedTitle = sheet.getRow(13).getCell(4).getStringCellValue();
		Assert.assertEquals(actual, expectedTitle);
		System.out.println("the actual title is same as the expected title");



	}



	//validate the product brand with selected brand name
	@Test(enabled=false)
	public void validateProduct_name() {
		hp.clicksOnFashionButton();
		hp.clicksOnWomenCatogoryButton();
		hp.clicksShoes();
		hp.clicksontheBRrand();



		hp.clicksonfilter();
		hp.clickson_lowtohigh();
		String actual = hp.pagetitle();
		String expectedtitle = sheet.getRow(16).getCell(4).getStringCellValue();
		Assert.assertEquals(actual, expectedtitle);
		System.out.println("the actual title is same as the expected title");
	}

	//searching the test data in the searchbox
	@Test(enabled=false)
	public void searchSlippers() {
		hp.clickson_searchCategory();
		String actual = hp.resultText();
		String expectedtext = sheet.getRow(20).getCell(4).getStringCellValue();
		Assert.assertEquals(actual, expectedtext);
	}
	//validating the title of kids category
	@Test(enabled=false)
	public void validateKidstitle() {
		hp.clicksOnFashionButton();
		hp.clicksonKidCategory();
		String actual = hp.title();
		String expectedTitle = sheet.getRow(24).getCell(4).getStringCellValue();
		Assert.assertEquals(actual, expectedTitle);
	}

	//?????
	@Test(enabled=true)
	public void validateKidsTopic() throws InterruptedException {
		hp.clicksOnFashionButton();
		hp.clicksonKidCategory();
		hp.gettextofKidsproducts();
	}
	//validating the title of Bags&luggage category
	@Test(enabled=false)
	public void validateBagsLagguageTitle() {
		hp.clicksOnFashionButton();
		hp.clicksonBagesLagguageCategoty();
		String actual = hp.title();
		String expected = sheet.getRow(28).getCell(4).getStringCellValue();
		Assert.assertEquals(actual, expected);

	}
	//checking the functionality of the Back to top button
	@Test(enabled =false)
	public void functionalityofBacttotopButton() {
		hp.clicksonBacktoTopButton();
	}

	//validateTextafterfilter (made for amazon)
	@Test(enabled=false)
	public void validateTextafterfilter() {
		hp.clicksOnFashionButton();
		hp.clicksonBagesLagguageCategoty();
		hp.clicksonMadeforAmazonfilter();
		String actual = hp.getTextofFirstproduct();
		String expected = sheet.getRow(32).getCell(4).getStringCellValue();
		Assert.assertEquals(actual, expected);

	}
	
	//validate the title of the spotswear category
	
	@Test(enabled = false)
	public void validateSpotswearTitle() {
		hp.clicksOnFashionButton();
		hp.clicksonSpotswearCatagory();
		String actual = hp.title();
		String expected = sheet.getRow(46).getCell(4).getStringCellValue();
		Assert.assertEquals(actual, expected);
	}
	


	@AfterClass
	public void closeSetup() {
		//teardown();
	}
}
