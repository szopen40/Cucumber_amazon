package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import utils.StartPage;

public class CartPage extends StartPage {

	private String lastReadPrice;
	private String subtotalPrice;

	public CartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Cart")
	private WebElement cart;
	
	@FindBy(css = "[class='a-color-price hlb-price a-inline-block a-text-bold']")
	private WebElement price;
	
	@FindBy(css = "[class='a-color-price hlb-price a-inline-block a-text-bold']")
	private WebElement cart_price;
	
	public CartPage goToCart() {
		cart.click();
		return new CartPage(driver);
	}

	public String getPrice() {
		if (price != null) {
			lastReadPrice = price.getText();
		} else {
			System.out.println("Using last read price.");
		}

		System.out.println(lastReadPrice);
		return lastReadPrice;
	}

	public String getCartSubtotal() {
		if (cart_price != null) {
			subtotalPrice = cart_price.getText();
		} else {
			System.out.println("Using last read price.");
		}
		return subtotalPrice;
	}

	public String getSubtotalPrice() {
		return subtotalPrice;
	}

	public String getLastReadPrice() {
		return lastReadPrice;
	}
}
