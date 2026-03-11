
package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import hooks.Hooks;
import pages.SearchPage;

public class SearchDefinition {

    WebDriver driver;
    SearchPage search;

    @Given("user launches browser")
    public void user_launches_browser() {

        driver = Hooks.driver;
        search = new SearchPage(driver);
    }

    @When("user enters product name in search box")
    public void user_enters_product_name_in_search_box() {

        search.enterProductName("book");
    }

    @And("user clicks search button")
    public void user_clicks_search_button() {

        search.clickSearchButton();
    }

    @Then("product should be displayed in search result")
    public void product_should_be_displayed_in_search_result()
    {

        String result = search.getSearchResult();
        Assert.assertTrue(result.contains("book"));
    }
}

