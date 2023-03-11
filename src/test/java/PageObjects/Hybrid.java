package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hybrid {

    public Hybrid(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/a")
    private WebElement returnButton;

    public void clickonReturnButton() {this.returnButton = returnButton;}

}
