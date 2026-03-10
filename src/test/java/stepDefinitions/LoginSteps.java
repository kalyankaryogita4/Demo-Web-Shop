
package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import hooks.Hooks;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("user launches browser")
    public void user_launches_browser() {

        driver = Hooks.driver;
        loginPage = new LoginPage(driver);
    }

    @When("user clicks login link")
    public void user_clicks_login_link() {

        loginPage.clickLoginLink();
    }

    @And("user enters valid email and password")
    public void user_enters_valid_email_and_password() {

        loginPage.enterEmail("testuser123@gmail.com");
        loginPage.enterPassword("Password123");
    }

    @And("user enters invalid email and password")
    public void user_enters_invalid_email_and_password() {

        loginPage.enterEmail("wrong@gmail.com");
        loginPage.enterPassword("wrongpass");
    }

    @And("user clicks login button")
    public void user_clicks_login_button() {

        loginPage.clickLoginButton();
    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Web Shop"));
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

        String error = loginPage.getErrorMessage();
        Assert.assertTrue(error.contains("unsuccessful"));
    }
}

