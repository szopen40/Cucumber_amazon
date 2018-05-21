package runner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;


public class Temporary {

	HomePage homepage;
	WebDriver driver;
	SearchPage search;
	ProductPage product;
	CartPage cart;

	@Given("^navigate to amazon page$")
	public void navigate_to_amazon_page() throws Throwable {
		// initialization of firefox driver
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		homepage = new HomePage(driver);
		homepage.goToHomePage();
	}

	@When("^I go to Camera,Photo & Video$")
	public void i_go_to_Camera_Photo_Video() throws Throwable {
		search = homepage.searchItem().chooseCategory();
	}

	@When("^Go to top rated products$")
	public void go_to_top_rated_products() throws Throwable {
		search.topRatedProducts();
	}

	@When("^Add to cart third product two times$")
	public void add_to_cart_third_product_five_times() throws Throwable {
		product = search.selectThirdProduct().selectQuantity();
	}

	@Then("^I remember total cost of order$")
	public void i_remember_total_cost_of_order() throws Throwable {
		cart = product.addToCart();
		cart.getPrice();
		cart.goToCart();
	}

	@Then("^go to cart page$")
	public void go_to_cart_page() throws Throwable {
		cart.getCartSubtotal();

	}

	@Then("^Compare total cost of product with value in cart$")
	public void compare_total_cost_of_product_with_value_in_cart() throws Throwable {
		String lastReadPrice = cart.getLastReadPrice();
		String subtotalPrice = cart.getSubtotalPrice();
		Assert.assertEquals(lastReadPrice, subtotalPrice);
		System.out.println("Expected: "+lastReadPrice+ " Received: "+subtotalPrice);
		homepage.close_page();
		System.out.println("Page closed");
	}
}
