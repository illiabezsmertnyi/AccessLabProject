package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoronavirusPage extends BasePage {

    @FindBy(xpath = "//a[@href = '/news/have_your_say']")
    private WebElement storiesPageButton;

    public CoronavirusPage(WebDriver driver) {
        super(driver);
    }

    public void clickStoriesPageButton() {
        storiesPageButton.click();
    }

}
