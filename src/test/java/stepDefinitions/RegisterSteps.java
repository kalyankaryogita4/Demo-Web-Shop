package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.RegisterPage;
import utilities.DriverFactory;

public class RegisterSteps {

    WebDriver driver = DriverFactory.getDriver();
    RegisterPage register = new RegisterPage(driver);

    @When("user clicks register link")
    public void click_register_link() {
        register.clickRegisterLink();
    }

    @And("user enters registration details")
    public void enter_details() {

        register.enterFirstName("Yogita");
        register.enterLastName("Test");
        register.enterEmail("yogita123@gmail.com");
        register.enterPassword("test123");
        register.enterConfirmPassword("test123");
    }

    @And("user clicks register button")
    public void click_register_button() {
        register.clickRegisterButton();
    }

    @Then("user should see registration successful message")
    public void verify_registration() {

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Register"));
    }
}