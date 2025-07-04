package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    WebDriver driver;
    

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginBtn = By.xpath("//*[contains(@type, 'submit')]");
    
      
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        
    }

    public void enterUsername(String uname) {
    		driver.findElement(usernameField).sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        driver.findElement(passwordField).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}

