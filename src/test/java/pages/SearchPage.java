package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.AbstractPage;

public class SearchPage extends AbstractPage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public SearchPage topRatedProducts(){
		driver.findElement(By.linkText("Top-Rated Digital Cameras")).click();
		return new SearchPage(driver);
	}
	
	public ProductPage selectThirdProduct(){
		driver.findElement(By.xpath("//li[@id='result_2']//*[contains(@href,'www.amazon')]")).click();
		return new ProductPage(driver);
	}
}
