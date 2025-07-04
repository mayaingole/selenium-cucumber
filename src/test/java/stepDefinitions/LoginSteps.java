package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import utils.DriverFactory;
import utils.WaitHelper;
import utils.ConfigReader;

	import java.util.logging.Logger;

	public class LoginSteps {

		WebDriver driver = DriverFactory.getDriver(); // Always get driver
		LoginPage loginPage = new LoginPage(driver);  // ✅ initialize with driver
	    Logger logger = Logger.getLogger(LoginSteps.class.getName());
	    int timeout = Integer.parseInt(ConfigReader.get("wait.timeout"));
	    WaitHelper wait = new WaitHelper(driver, timeout);

	    @Given("user is on login page")
	    public void user_is_on_login_page() {
	        logger.info("Opening browser and navigating to login page");
	        String baseUrl = ConfigReader.get("baseUrl");
	        driver.get(baseUrl);
	        wait.waitForPageToLoad();
	        loginPage = new LoginPage(driver);
	       	        	              
	        }

	    @When("user enters username {string} and password {string}")
	    public void user_enters_credentials(String username, String password) {
	        logger.info("Entering credentials");
	        
	        loginPage.enterUsername(username);
	        loginPage.enterPassword(password);
	        loginPage.clickLogin();
	    }

	    @Then("user should be logged in")
	    public void user_should_be_logged_in() {
	        logger.info("Login should be successful");
	        DriverFactory.quitDriver();
	    }

	}
	 
