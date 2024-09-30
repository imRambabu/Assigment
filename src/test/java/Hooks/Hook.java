package Hooks;

	import io.cucumber.java.Before;
import TestContextInfo.TestContext;
import io.cucumber.java.After;

	public class Hook {
	    private TestContext testContext;

	    public Hook(TestContext context) {
	        this.testContext = context;
	    }

	    @Before
	    public void setUp() {
	        // Initialize the WebDriver before each scenario if needed
	        testContext.getDriver().manage().window().maximize();
	    }

	    @After
	    public void tearDown() {
	        // Clean up the WebDriver after each scenario
	        testContext.getDriver().quit();
	    }
	}


