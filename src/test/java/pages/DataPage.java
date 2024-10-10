package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataPage {
    public DataPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@placeholder='Search . . .']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='sorting_1'])[1]")
    public WebElement result;

}
