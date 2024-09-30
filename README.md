# Cucumber-Selenium Test Automation Project

This project automates the sorting functionality on the "All Items" page using Cucumber, Selenium, and TestNG. The test suite covers scenarios such as sorting items by name (Z-A) and verifying other sorting options.

## Project Structure

```bash
.
├── src
│   ├── main
│   │   └── java
│   ├── test
│   │   ├── java
│   │   │   └── StepDefinitions
│   │   │   └── PageObjects
│   │   └── resourcesKey Directories


src/test/resources/FeatureFiles: Contains .feature files that describe scenarios in Gherkin syntax.
src/test/java/StepDefinitions: Contains step definition files for binding Gherkin steps to code.
src/test/java/PageObjects: Contains page objects representing the web elements and actions.
src/main/resources/config: Configuration files such as testng.xml.
Prerequisites
Before running this project, make sure you have the following installed:

Java (JDK 8+)
Maven
Selenium WebDriver
TestNG
Cucumber-JVM (6+)
Setting Up the Project
│   │       └── FeatureFiles
│   └── resources
│       └── config
└── pom.xml


Feature Files
The feature files contain the Gherkin syntax for defining scenarios. Here's an example Login.feature that includes a Background for shared steps.

Explanation:
Background: Steps common to all scenarios (login, etc.).
Scenario: Each scenario tests a specific sorting functionality.
Step Definitions
The step definitions bind the Gherkin steps to Java methods. Each method corresponds to the Gherkin steps like Given, When, and Then.

Page Object Pattern
Follow the Page Object pattern for organizing locators and interactions with the web page. This pattern separates the page-related logic from the test logic, making the code more maintainable.

Troubleshooting
NullPointerException on WebDriver: Ensure that the WebDriver instance is initialized correctly. You can do this in a @Before hook.

Feature Files Not Found: If Cucumber can't find the feature files, make sure they are correctly located under src/test/resources/FeatureFiles.

SLF4J Warnings: These warnings can generally be ignored, but you can fix them by adding an appropriate SLF4J binding (such as slf4j-log4j12) to the project dependencies.

Dependencies
The required dependencies for Cucumber, Selenium, TestNG, and logging are defined in the pom.xml file.

Conclusion
This project demonstrates how to set up Cucumber with Selenium to test sorting functionality on a web page. The use of Background in feature files allows for reusable steps, making the tests more maintainable and scalable.



