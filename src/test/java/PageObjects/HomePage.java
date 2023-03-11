package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readMoreButton;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement learnMore;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement Readmorebutton;

    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement FAQ;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[3]/h3/button")
    private WebElement collapsedbutton;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement button;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement InstructorsButton;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement OurInstructors;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement HybridReadMoreButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement Hybrid;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement Enrollment;




    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

    public void writeEmailToEmailField(String email) {
        this.emailField.sendKeys(email);
    }

    public WebElement getEmailField() {
        return emailField;
    }
    public org.openqa.selenium.WebElement getFAQ() {
        return FAQ;
    }

    public void setReadMore(WebElement readMore) {
        this.readMoreButton = readMore;
    }

    public void clickOnreadMoreButton() {
        this.readMoreButton.click();
    }

    public void clickOnLearnMoreButton() {
        this.learnMore.click();
    }

    public void clickReadmoreButton() {this.readMoreButton.click();}

    public void clickOnCollapsedbutton() {this.collapsedbutton.click();}

    public void clickOnButton(){this.button.click();}

    public void clickOnInstructorsButton(){this.InstructorsButton.click();}

    public String getInstructorsText(){return OurInstructors.getText();}

    public void clickOnHybridReadMoreButton(){this.HybridReadMoreButton.click();}

    public String getHybridText(){return Hybrid.getText();}

    public void clickOnEnrollment() {this.Enrollment.click();}

}



