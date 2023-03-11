package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enrollment {

    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstName;
    public void writeFirstName() {this.firstName.sendKeys("Bedeu");}

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;
    public void writeLastName() {this.lastName.sendKeys("Sabina");}

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement username;
    public void writeUsername() {this.username.sendKeys("SabinaB");}


    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;
    public void writePassword() {this.password.sendKeys("Nanana");}


    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPassword;
    public void writeConfirmPassword() {this.confirmPassword.sendKeys("Nanana");}


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;
    public void clickOnNextbutton() {this.nextButton.click();}

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement Personalinformation;
    public String getPersonalinformationText() {return Personalinformation.getText();}




    public Enrollment(WebDriver driver) {PageFactory.initElements(driver, this);}}

