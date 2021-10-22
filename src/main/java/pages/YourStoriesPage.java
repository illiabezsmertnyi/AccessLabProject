package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourStoriesPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'nw-c-5-slice')]//div[contains(@class, 'nw-o-keyline nw')][2]")
    private WebElement contactFormPageButton;

    public YourStoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickContactFormPageButton() {
        contactFormPageButton.click();
    }

}
