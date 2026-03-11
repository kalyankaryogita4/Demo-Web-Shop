
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.id("small-searchterms");
    By searchButton = By.cssSelector("input.search-box-button");
    By searchResult = By.cssSelector(".product-title");

    public void enterProductName(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public String getSearchResult() {
        return driver.findElement(searchResult).getText();
    }
}

