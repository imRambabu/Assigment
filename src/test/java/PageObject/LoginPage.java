package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By TXt_username = By.id("user-name");
	By Txt_password = By.id("password");
	By LoginButton = By.id("login-button");
	By lbl_logo = By.xpath("//div[@class='app_logo']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
    
	public void navigateto_LoginPage() {
		
		driver.get("https://www.saucedemo.com/");
	}
	public void enterUsername(String username) {
		driver.findElement(TXt_username).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElement(Txt_password).sendKeys(password);

	}

	public void clickLogin() {
		driver.findElement(LoginButton).click();

	}

	public void userLogin(String username, String password) {
		driver.findElement(TXt_username).sendKeys(username);
		driver.findElement(Txt_password).sendKeys(password);
		driver.findElement(lbl_logo).click();
	}

	public void islogDisplayed() {
		driver.findElement(lbl_logo).isDisplayed();
	}
}
