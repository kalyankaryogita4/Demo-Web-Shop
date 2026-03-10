
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By loginLink = By.linkText("Log in");
    By email = By.id("Email");
    By password = By.id("Password");
    By loginButton = By.cssSelector("input.login-button");
    By errorMessage = By.cssSelector(".message-error");

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void enterEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    public void enterPassword(String userPassword) {
        driver.findElement(password).sendKeys(userPassword);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}

