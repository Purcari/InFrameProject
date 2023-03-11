package org.example;


import PageObjects.Enrollment;
import PageObjects.HomePage;
import PageObjects.Hybrid;
import PageObjects.Virtual;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import javax.xml.xpath.XPath;

public class StepDefinitions {
    private WebDriver driver = new ChromeDriver();
    private HomePage homePage;
    private Virtual virtual;

    private Hybrid hybrid;

    private Enrollment enrollment;


    public StepDefinitions() {
        driver.manage().window().maximize();
        virtual = new Virtual(driver);
        homePage = new HomePage(driver);
        hybrid = new Hybrid(driver);
        enrollment = new Enrollment(driver);

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
        Utils.scrollToElement(driver, homePage.getEmailField());
        homePage.clickOnreadMoreButton();
    }

    @Then("A new page opens")
    public void a_new_page_opens() {
        driver.getPageSource();
    }

    @Given("I am on the virtual page")
    public void i_am_on_the_virtual_page() {
        driver.get("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/routes/virtual.html");
    }

    @When("I press the return button")
    public void i_press_the_return_button() {
        virtual.clickOnReturnButton();
    }

    @Then("I return to the homepage")
    public void i_return_to_the_homepage() {
        driver.get("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/index.html");
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        driver.get("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/index.html#learn-fundamentals");
    }

    @When("I click on the what you ll learn button")
    public void i_click_on_the_what_you_ll_learn_button() {
        homePage.clickOnLearnMoreButton();
    }

    @Then("Redirect to read more button")
    public void redirect_to_read_more_button() {
    }

    @Given("I m navigating on the homepage")
    public void i_am_navigating_on_the_homepage() {
        driver.get("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/index.html");
    }

    @When("I reach the faq section")
    public void i_reach_the_faq_section() {
        Utils.scrollToElement(driver, homePage.getFAQ());
    }

    @And("I click on the show more arrow")
    public void i_click_on_the_show_more_arrow() {
        homePage.clickOnCollapsedbutton();
    }

    @Then("More information is shown")
    public void more_information_is_shown() {
        homePage.clickOnButton();
    }

    @Given("I need information about the trainers when on homepage")
    public void i_need_information_about_the_trainers_when_on_homepage() {
        driver.get("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/index.html#");
    }

    @When("I click on the Instructors button")
    public void i_click_on_the_Instructors_button() {
        homePage.clickOnInstructorsButton();}

    @Then("I am taken to the section where I can find more info about them")
    public void i_am_taken_to_the_section_where_i_cn_find_more_info_about_them () {
        Assert.assertEquals("Our Instructors", homePage.getInstructorsText());}

   @Given("I reach the Hybrid section")
   public void i_reach_the_hibrid_section(){driver.get
           ("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/index.html");}
    @When("I click on the read more button")
    public void i_click_on_the_read_more_button(){Utils.scrollToElement(driver, homePage.getEmailField());
        homePage.clickOnHybridReadMoreButton();
    }
    @Then("Hybrid page opens")
    public void hybrid_page_opens(){driver.getPageSource();}

    @Given("I m on the Hybrid page")
    public void i_m_on_the_hybrid_page(){driver.get
            ("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/routes/hybrid.html");}
    @When("I click on the return button")
    public void i_click_on_the_return_button(){hybrid.clickonReturnButton();}

    @Given("I am on the mainpage")
    public void i_am_on_the_mainpage(){driver.get
            ("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/index.html");}
    @When("I click on the Enrollment button")
    public void i_click_on_the_enrollment_button(){homePage.clickOnEnrollment();}
    @Then("The sign up page opens")
    public void the_sign_u_page_opens(){driver.get
            ("file:///C:/Users/Bdu/Desktop/asa%20a%20zis%20Andrei/Testing-Env/routes/enrollment.html");}

    @Given("I am on the Personal information section")
    public void i_am_on_the_personal_information_section()
    {Assert.assertEquals("Personal information", enrollment.getPersonalinformationText());}


    @When("I fill in the fields with valid input")
    public void fillInValidData() {
        enrollment.writeFirstName();
        enrollment.writeLastName();
        enrollment.writeUsername();
        enrollment.writePassword();
        enrollment.writeConfirmPassword();

    }










    @After
    public void cleanUp() {
        driver.quit();

    }
}


