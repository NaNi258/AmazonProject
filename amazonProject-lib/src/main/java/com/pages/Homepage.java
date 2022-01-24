package com.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Base.TestBase;

public class Homepage extends TestBase {

	public Homepage() {
		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath = "//a[text()='Fashion']") WebElement fashionbutton;
	@FindBy(xpath = "//div[@id='nav-subnav']/child::a/child::span[@class='nav-a-content']") List<WebElement> content;
	@FindBy(xpath = "//div[@id='nav-subnav']/child::a[2]") WebElement womenCategory;
	@FindBy(xpath = "//span[text()='Shoes']") WebElement shoes;
	@FindBy(xpath = "//div[@id='s-refinements']/child::div[5]/descendant::a[2]") WebElement paragon;
	@FindBy(xpath = "//span[@id='a-autoid-0-announce']") WebElement filter;
	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]") WebElement firstproduct_shoe;
	@FindBy(xpath="//a[text()='Price: Low to High']") WebElement lowtohigh;
	@FindBy(xpath = "//span[@cel_widget_id='MAIN-SEARCH_RESULTS-7']/descendant::h5/child::span") WebElement productBrand;
	@FindBy(xpath="//select[@id='searchDropdownBox']") WebElement search_category;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']") WebElement searchBox;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']") WebElement searchButton;
	@FindBy(xpath = "//span[@class='a-color-state a-text-bold']") WebElement result;
	@FindBy(xpath = "//div[@id='nav-subnav']/child::a[4]") WebElement kidCategory;
	@FindBy(xpath = "//div[@class='left_nav browseBox']/descendant::a") List<WebElement> kidsProducts;
	@FindBy(xpath = "//div[@id='nav-subnav']/child::a[5]") WebElement bagLagguagecategory;
	@FindBy(xpath = "//div[@class='navFooterBackToTop']") WebElement BacktoTop;
	@FindBy(xpath = "//div[@id='s-refinements']/descendant::li[2]/descendant::a") WebElement madeforAmazon;
	@FindBy(xpath = "(//span[text()='AmazonBasics'])[1]") WebElement firstproductbrand;
	@FindBy(xpath = "//div[@id='nav-subnav']/child::a[6]") WebElement spotswearCatagory;
	@FindBy(xpath = "//div[@id='s-refinements']/child::div[2]/descendant::a") WebElement primeFilter;
	@FindBy(xpath = "(//i[@class='a-icon a-icon-prime a-icon-medium'])[1]") WebElement productfilter;
	@FindBy(xpath = "//div[@id='sobe_d_b_15-carousel']/descendant::span") List<WebElement> amazonBrandCarosal;

	@FindBy(xpath = "//div[@class='a-column a-span12 apb-browse-left-nav apb-browse-col-pad-right a-span-last']/descendant::span[text()='Fire-Boltt']") WebElement fire_bolttProduct;



	public String title() {



		return driver.getTitle();
	}



	public void clicksOnFashionButton() {
		fashionbutton.click();
	}




	public String numberofContent() {
		int t = content.size();
		String total=Integer.toString(t);
		return total;
	}



	public void clicksOnWomenCatogoryButton() {
		womenCategory.click();
	}



	public void clicksShoes() {
		shoes.click();
	}
	public void clicksontheBRrand() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",paragon);
		paragon.click();
	}
	public void clicksonfilter() {
		filter.click();
	}
	public void clickonfirstproduct_shoe() {
		firstproduct_shoe.click();
	}
	public void clickson_lowtohigh(){
		lowtohigh.click();
	}
	public String pagetitle() {



		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",productBrand);



		return productBrand.getText();
	}



	public void clickson_searchCategory() {
		search_category.click();
		Select sc=new Select(search_category);
		sc.selectByVisibleText(sheet.getRow(18).getCell(4).getStringCellValue());
		searchBox.sendKeys(sheet.getRow(19).getCell(4).getStringCellValue());
		searchButton.click();



	}
	public String resultText() {
		return result.getText();
	}



	public void clicksonKidCategory() {
		kidCategory.click();
	}


	public void gettextofKidsproducts() throws InterruptedException {
		
		int total = kidsProducts.size();
		System.out.println(total);//10
		for(int i=0;i<=total;i++) {

			// String[] st=new String[10];
			// st[i]=topics;
			// int k=33;
			// System.out.println("array: "+st[i]);
			// System.out.println("fitrst: "+st[0]);

			 String actual = kidsProducts.get(i).getText();
			int k=34;
			Assert.assertEquals(actual,sheet.getRow(k).getCell(4).getStringCellValue());
			Thread.sleep(3000);
			k=k+1;

		}

		// for (WebElement topics:kidsProducts) {
		// String t = topics.getText();
		// System.out.println(t);
		// String [] st=new String[10];
		// int j=0,k=33;
		// st[j]=t;
		// System.out.println("array: "+st[j]);
		// System.out.println(st[0]);
		//
		// //System.out.println("array"+st[j]);
		// j++;
		// ++k;
		//
		// }



	}



	public void clicksonBagesLagguageCategoty() {
		bagLagguagecategory.click();
	}



	public void clicksonBacktoTopButton() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",BacktoTop);
		Actions ac=new Actions(driver);
		ac.moveToElement(BacktoTop).click().perform();
		//BacktoTop.click();
	}



	public void clicksonMadeforAmazonfilter() {
		madeforAmazon.click();
	}



	public String getTextofFirstproduct() {
		return firstproductbrand.getText();
	}

	public void clicksonSpotswearCatagory() {
		spotswearCatagory.click();
	}
	public void clicksonPrimeFilter() {
		primeFilter.click();
	}
	public String getTextofprimeProduct() {
		return productfilter.getText();
	}

	public void clicksonFire_bolttproduct() {
		fire_bolttProduct.click();
	}
	public void clicksonfire_bolttfirstproduct() {
		
	}

}
