package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.AbstractPage;

public class HomePage extends AbstractPage {
	
	public HomePage(WebDriver driver){
		super(driver);
	}

	public HomePage searchItem() {
		driver.findElement(By.id("nav-link-shopall")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[contains(@href,'Camera')]"))));
//		System.out.println("Going through categories");
		return new HomePage(driver);
	}
	public SearchPage chooseCategory(){
		//WebElement element = driver.findElement(By.partialLinkText("Camera, Photo & Video"));
		WebElement element = driver.findElement(By.xpath("//*[@id='a-page']//*[contains(@href,'Camera')]"));
		WebDriverWait wait = new WebDriverWait(driver, 20); //here, wait time is 20 seconds

		wait.until(ExpectedConditions.visibilityOf(element)); //this will wait for elememt to be visible for 20 seconds
		element.click(); //now it clicks on element
		
		//driver.findElement(By.partialLinkText("Camera")).click();
		return new SearchPage(driver);
	}

}
