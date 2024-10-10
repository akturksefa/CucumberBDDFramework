package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuAppPage {
    public HerokuAppPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@onclick='addElement()']")
    public WebElement addElement;

    @FindBy(xpath = "//*[@class='added-manually']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@onclick='deleteElement()']")
    public List<WebElement> deleteButtonList;



}
