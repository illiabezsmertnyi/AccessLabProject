package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormPage extends BasePage {

    @FindBy(xpath = "//textarea[@placeholder]")
    private WebElement descriptionField;

    public ContactFormPage(WebDriver driver) {
        super(driver);
    }

    public void enterTextToSearchField(final String descriptionText) {
        descriptionField.clear();
        descriptionField.sendKeys(descriptionText);
        descriptionField.sendKeys(Keys.ENTER);
    }

}
