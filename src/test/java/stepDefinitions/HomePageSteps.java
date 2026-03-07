package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import utilities.DriverFactory;

public class HomePageSteps {

    WebDriver driver = DriverFactory.getDriver();
    HomePage home = new HomePage(driver);

    @Given("user launches demo web shop website")
    public void launch_website() {
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Then("user should see homepage title")
    public void verify_title() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Demo Web Shop");
    }

    @And("user should see Books category")
    public void verify_books() {
        Assert.assertTrue(home.isBooksDisplayed());
    }

    @And("user should see Electronics category")
    public void verify_electronics() {
        Assert.assertTrue(home.isElectronicsDisplayed());
    }

    @And("user should see Apparel category")
    public void verify_apparel() {
        Assert.assertTrue(home.isApparelDisplayed());
    }
}