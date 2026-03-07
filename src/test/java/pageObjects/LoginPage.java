package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By loginLink = By.linkText("Log in");
    By email = By.id("Email");
    By password = By.id("Password");
    By loginButton = By.cssSelector("input.login-button");
    By errorMessage = By.cssSelector(".validation-summary-errors");

    // Actions

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void enterEmail(String mail) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(mail);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}