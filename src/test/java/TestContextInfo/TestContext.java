package TestContextInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Managers.PageObjectManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestContext {
	private WebDriver driver;
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public TestContext() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		pageObjectManager = new PageObjectManager(driver);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;

	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;

	}
}
