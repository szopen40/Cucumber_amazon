package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


import utils.AbstractPage;

public class ProductPage extends StartPage {

	public ProductPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "quantity")
	private WebElement quantity;

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement addToCart;
	
	public ProductPage selectQuantity() {
		Select drop = new Select(quantity);
		drop.selectByValue("2");
		return new ProductPage(driver);
	}
	
	public ProductPage additionalAssurance(){
		if (driver.findElement(By.id("siNoCoverage-announce")).isEnabled()) {
		   driver.findElement(By.id("siNoCoverage-announce")).click();
		} else {
		   System.out.println("No additional assurance taken");
		}
		return new ProductPage(driver);
	}

	public CartPage addToCart() {
		addToCart.click();
		return new CartPage(driver);
	}
}
