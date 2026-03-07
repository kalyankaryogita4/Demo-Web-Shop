package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By registerLink = By.linkText("Register");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");

    public void clickRegisterLink() {
        driver.findElement(registerLink).click();
    }

    public void enterFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }

    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void enterConfirmPassword(String pass) {
        driver.findElement(confirmPassword).sendKeys(pass);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
}