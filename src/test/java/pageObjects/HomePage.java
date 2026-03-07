package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By books = By.linkText("Books");
    By electronics = By.linkText("Electronics");
    By apparel = By.linkText("Apparel & Shoes");

    public boolean isBooksDisplayed() {
        return driver.findElement(books).isDisplayed();
    }

    public boolean isElectronicsDisplayed() {
        return driver.findElement(electronics).isDisplayed();
    }

    public boolean isApparelDisplayed() {
        return driver.findElement(apparel).isDisplayed();
    }
}