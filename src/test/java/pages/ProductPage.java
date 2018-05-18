package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import utils.AbstractPage;

public class ProductPage extends AbstractPage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	public ProductPage selectQuantity() {
		WebElement dropdown = driver.findElement(By.name("quantity"));
		Select drop = new Select(dropdown);
		drop.selectByValue("2");
		return new ProductPage(driver);
	}
	
	public ProductPage additionalAssurance(){
		// in case of additional assurance offer
		if (driver.findElement(By.id("siNoCoverage-announce")).isEnabled()) {
			driver.findElement(By.id("siNoCoverage-announce")).click();
		} else {
			System.out.println("No additional assurance taken");
		}
		return new ProductPage(driver);
	}

	public CartPage addToCart() {
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		return new CartPage(driver);
	}
}
