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

public class SortingPage {
	
	WebDriver driver;
	By SortTheProduct=By.xpath("//select[@class='product_sort_container']");
	By Products=By.className("inventory_item_name");
	
	public SortingPage(WebDriver driver) {
		this.driver = driver;
	}
public void  VerifySorting(String sortOrder)
	
	{
		 Select dropdown = new Select(driver.findElement(SortTheProduct));
	        dropdown.selectByVisibleText(sortOrder);
	}
	public void DesendingName() {
		
		 List<WebElement> products = driver.findElements(Products);
	        List<Object> productNames = products.stream()
	                                             .map(WebElement::getText)
	                                             .collect(Collectors.toList());

	        List<Object> sortedNames = new ArrayList<Object>(productNames);
	        sortedNames.sort(Collections.reverseOrder());

	        Assert.assertEquals(sortedNames, productNames);
	        
	    
	}

}
