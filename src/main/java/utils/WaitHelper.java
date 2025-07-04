package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {

	private WebDriver driver;
    private WebDriverWait wait;

    public WaitHelper(WebDriver driver, int timeoutInSeconds) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    }

    public void waitForElementVisible(By locator) {
        System.out.println("Waiting for visibility of element: " + locator);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(By locator) {
        System.out.println("Waiting for element to be clickable: " + locator);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForTitleContains(String titlePart) {
        System.out.println("Waiting for title to contain: " + titlePart);
        wait.until(ExpectedConditions.titleContains(titlePart));
    }

    public void waitForTextPresentInElement(By locator, String text) {
        System.out.println("Waiting for text '" + text + "' in element: " + locator);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public void waitForPageToLoad() {
        System.out.println("Waiting for page to load completely...");
        wait.until(webdriver -> ((JavascriptExecutor) driver)
                .executeScript("return document.readyState").equals("complete"));
    }
}
