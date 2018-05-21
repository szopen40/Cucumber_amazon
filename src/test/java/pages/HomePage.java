package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.StartPage;

public class HomePage extends StartPage {
	
	public HomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nav-link-shopall")
	private WebElement department;
	
	@FindBy(xpath = "//*[@id='a-page']//*[contains(@href,'Camera')]")
	private WebElement category;

	public HomePage searchItem() {
		department.click();
		return new HomePage(driver);
	}
	public SearchPage chooseCategory(){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(category)); 
		category.click();
		return new SearchPage(driver);
	}
}
