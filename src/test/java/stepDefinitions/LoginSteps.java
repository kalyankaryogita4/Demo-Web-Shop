package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginSteps {

    WebDriver driver;
    Properties prop;

    @Given("user launches browser")
    public void user_launches_browser() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
        prop.load(fis);

        String url = prop.getProperty("url");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("user clicks login link")
    public void user_clicks_login_link() {
        driver.findElement(By.linkText("Log in")).click();
    }

    @And("user enters valid email and password")
    public void user_enters_valid_email_and_password() {
        driver.findElement(By.id("Email")).sendKeys("testuser123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Password123");
    }

    @And("user enters invalid email and password")
    public void user_enters_invalid_email_and_password() {
        driver.findElement(By.id("Email")).sendKeys("wrong@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("wrongpass");
    }

    @And("user clicks login button")
    public void user_clicks_login_button() {
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Web Shop"));
        driver.quit();
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        String error = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
        Assert.assertTrue(error.contains("unsuccessful"));
        driver.quit();
    }
}