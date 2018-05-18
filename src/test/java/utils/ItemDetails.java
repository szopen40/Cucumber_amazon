/*package utils;

import org.openqa.selenium.WebDriver;

import pages.CartPage;
import pages.HomePage;

public class ItemDetails extends AbstractPage {

	public ItemDetails(WebDriver driver) {
		super(driver);
	}

	CartPage prices = new CartPage(driver);
	

	
	public String expectedPrice(){
		String price_expected = prices.getPrice().toString();
		return price_expected;
	}
	
	public String subtotalPrice(){
		String subtotal = prices.getCartSubtotal().toString();
		return subtotal;
	}
}
*/