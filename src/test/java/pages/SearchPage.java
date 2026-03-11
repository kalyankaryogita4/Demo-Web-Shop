package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.id("small-searchterms");
    By searchButton = By.cssSelector("input.button-1.search-box-button");
    By productResult = By.cssSelector(".product-item");
    By noProductMessage = By.xpath("//*[contains(text(),'No products were found')]");

    public void enterProductName(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public boolean isProductDisplayed() {
        return driver.findElements(productResult).size() > 0;
    }

    public boolean isNoProductMessageDisplayed() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(noProductMessage)
        ).isDisplayed();
    }
}