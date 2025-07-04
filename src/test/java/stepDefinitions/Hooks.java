package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import utils.ReportGenerator;
import utils.ScreenshotUtil;
import utils.DriverFactory;
public class Hooks {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    
    @AfterAll
    public static void after_all_tests() {
        ReportGenerator.generateReport();
    }
}
