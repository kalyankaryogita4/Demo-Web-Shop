package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.SearchPage;

public class SearchDefinition {

    WebDriver driver;
    SearchPage search;

    @When("user enters product name in search box")
    public void user_enters_product_name_in_search_box() {

        driver = Hooks.driver;
        search = new SearchPage(driver);
        search.enterProductName("Laptop");
    }

    @And("user clicks search button")
    public void user_clicks_search_button() {

        search.clickSearchButton();
    }

    @Then("product should be displayed in search result")
    public void product_should_be_displayed_in_search_result() {

        Assert.assertTrue(search.isProductDisplayed());
    }

    @When("user enters invalid product name")
    public void user_enters_invalid_product_name() {

        driver = Hooks.driver;
        search = new SearchPage(driver);
        search.enterProductName("abcdxyz123");
    }

    @Then("no product message should be displayed")
    public void no_product_message_should_be_displayed() {

        Assert.assertTrue(search.isNoProductMessageDisplayed());
    }
}