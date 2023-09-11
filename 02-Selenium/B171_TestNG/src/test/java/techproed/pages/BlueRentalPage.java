package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {
    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//li//a)[1]")
    public WebElement loginButton;

    @FindBy(xpath = "(//input)[1]")
    public WebElement email;

    @FindBy(xpath = "(//button)[3]")
    public WebElement verify;


}
