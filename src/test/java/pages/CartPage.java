package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.AbstractPage;

public class CartPage extends AbstractPage {

	private String lastReadPrice;
	private String subtotalPrice;

	public CartPage(WebDriver driver) {
		super(driver);
	}

	public CartPage goToCart() {
		driver.findElement(By.linkText("Cart")).click();
		return new CartPage(driver);
	}

	public String getPrice() {
		WebElement elementFromPage = driver
				.findElement(By.cssSelector("[class='a-color-price hlb-price a-inline-block a-text-bold']"));
		if (elementFromPage != null) {
			lastReadPrice = elementFromPage.getText();

		} else {
			System.out.println("Using last read price.");
		}

		System.out.println(lastReadPrice);
		return lastReadPrice;
	}

	public String getCartSubtotal() {
		WebElement elementFromPage = driver.findElement(
				By.cssSelector("[class='a-size-medium a-color-price sc-price sc-white-space-nowrap  sc-price-sign']"));
		if (elementFromPage != null) {
			subtotalPrice = elementFromPage.getText();
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
