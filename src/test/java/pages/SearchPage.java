package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import utils.StartPage;

public class SearchPage extends HomePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Top-Rated Digital Cameras")
	private WebElement topRated;
	
	@FindBy(xpath = "//li[@id='result_2']//*[contains(@href,'www.amazon')]")
	private WebElement thirdProduct;
	
	public SearchPage topRatedProducts(){
		topRated.click();
		return new SearchPage(driver);
	}
	
	public ProductPage selectThirdProduct(){
		thirdProduct.click();
		return new ProductPage(driver);
	}
}
