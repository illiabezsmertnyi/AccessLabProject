package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//span[@aria-hidden]")
    private WebElement searchResultTitleText;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getSearchResultTitleText() { return searchResultTitleText.getText(); }

}
