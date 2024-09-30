package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckOutPage {
	
	public WebDriver driver;

	By addingButton = By.className("btn_inventory");
	By ShoppingCart = By.className("shopping_cart_link");
	By checkoutButton = By.id("checkout");
	By FirstName = By.id("first-name");
	By LastName = By.id("last-name");
	By PostalCode = By.id("postal-code");
	By continueButton = By.id("continue");
	By FinishButton = By.id("finish");
	By CheckoutCompleted = By.className("complete-header");

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void SelectingProduct() {
		List<WebElement> addButtons = driver.findElements(addingButton);
		for (WebElement addButton : addButtons) {
			addButton.click();
		}
	}

	public void clickonCart() {
		driver.findElement(ShoppingCart).click();
	}

	public void proceedtocheckout() {
		driver.findElement(checkoutButton).click();
		driver.findElement(FirstName).sendKeys("Rambabu");
		driver.findElement(LastName).sendKeys("Yadav");
		driver.findElement(PostalCode).sendKeys("12345");
		driver.findElement(continueButton).click();
		driver.findElement(FinishButton).click();
	}

	public void CheckoutCompleted() {
		WebElement confirmationMessage = driver.findElement(CheckoutCompleted);
		Assert.assertEquals("Thank you for your order!", confirmationMessage.getText());
	}

}
