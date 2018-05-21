package utils;

import org.openqa.selenium.WebDriver;
import pages.HomePage;


public class StartPage {
		public WebDriver driver;
		public StartPage(WebDriver driver){
			this.driver = driver;
		}
		public HomePage goToHomePage(){
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			return new HomePage(driver);
		}
		
		public void close_page(){
			driver.quit();
		}
}
