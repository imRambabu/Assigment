package PageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PriceSortingPage {

	
	public WebDriver driver;

	By PriceSorting = By.xpath("//select[@class='product_sort_container']");
	By PriceOFProducts = By.className("inventory_item_price");
	
	public PriceSortingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyPriceSorting(String Price) {
		
		Select dropdown = new Select(driver.findElement(PriceSorting));
		dropdown.selectByVisibleText(Price);
	}

	public void DesendingPrice() {
		List<WebElement> products = driver.findElements(PriceOFProducts);

		List<Double> productPrices = products.stream()
				.map(price -> Double.parseDouble(price.getText().replace("$", ""))).collect(Collectors.toList());

		List<Double> sortedPrices = new ArrayList<>(productPrices);
		sortedPrices.sort(Collections.reverseOrder());

		Assert.assertEquals(sortedPrices, productPrices);

		System.out.println(sortedPrices);
	}
}
