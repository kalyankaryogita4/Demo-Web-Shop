
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    // Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By searchBox = By.id("small-searchterms");
    By searchButton = By.xpath("//input[@value='Search']");
    By productTitle = By.xpath("//h2[@class='product-title']");
    By noProductMessage = By.xpath("//div[@class='no-result']");

    // Methods

    // Enter product name
    public void enterProductName(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }

    // Click search button
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    // Verify product displayed
    public boolean isProductDisplayed() {
        return driver.findElement(productTitle).isDisplayed();
    }

    // Get message when product not found
    public String getNoProductMessage() {
        return driver.findElement(noProductMessage).getText();
    }
}

