package Managers;

import org.openqa.selenium.WebDriver;

import PageObject.CheckOutPage;
import PageObject.LoginPage;
import PageObject.PriceSortingPage;
import PageObject.SortingPage;

public class PageObjectManager {
	private WebDriver driver;
	private LoginPage loginPage;
	private SortingPage sortingPage;
	private PriceSortingPage priceSortingPage;
	private CheckOutPage checkoutPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
   
	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage=new LoginPage(driver):loginPage;
	}
	public SortingPage getSortingPage() {
		return (sortingPage==null)? sortingPage=new SortingPage(driver):sortingPage;
	}
	public PriceSortingPage getPriceSortingPage() {
		return (priceSortingPage==null)? priceSortingPage=new PriceSortingPage(driver):priceSortingPage;
	}
	public CheckOutPage getCheckOutPage() {
		return (checkoutPage==null)? checkoutPage=new CheckOutPage(driver):checkoutPage;
	}
}
