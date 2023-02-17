package org.example;


import PageObjects.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    private final WebDriver driver = new ChromeDriver();
    private HomePage homePage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Given("I am on the home page")
    public void i_am_on_the_home_Page() {
        driver.get("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/index.html");
    }

    @When("I write the email address of {string}")
    public void i_write_the_email_address_of_example_example_com(String string) {
        homePage.writeEmailToEmailField(string);
    }

    @And("I click the submit button")
    public void i_click_the_submit_button() {
        homePage.clickOnSubmitButton();
    }

    @Then("The confirmation pop-up appears")
    public void the_confirmation_pop_up_appears() {
        driver.switchTo().alert().accept();
    }

    @Given("On the home page")
    public void i_am_on_the_home_page() {
        driver.get("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/index.html");
    }
    @When("I click the Read More button")
    public void click_on_read_More_button() {
        homePage.clickonreadMoreButton();
    }
    @Then("A new page opens")
    public void a_new_page_opens() {
        driver.getPageSource();
    }


    @After
    public void cleanUp() {
        driver.quit();

    }

}

