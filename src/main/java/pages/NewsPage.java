package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewsPage extends BasePage {

    @FindBy(xpath = "//h3")
    private WebElement articleText;

    @FindBy(xpath = "//div[@aria-label = 'Top Stories']//div[contains(@class, 'gs-u-mt@m')]//h3[contains(@class, 'gel-pica-bold')]\n")
    private List<WebElement> titleListText;

    @FindBy(xpath = "//div[contains(@class, 'primary-item')]//li[@class = 'nw-c-promo-meta']/a/span[@aria-hidden]")
    private WebElement categoryText;

    @FindBy(xpath = "//input[@type = 'text']")
    private WebElement searchField;



    public NewsPage(WebDriver driver) {
        super(driver);
    }

    public String getArticleText() { return articleText.getText(); }

    public List<WebElement> getTitleList() { return titleListText; }

    public String getCategoryText() { return categoryText.getText(); }

    public void enterTextToSearchField() {
        searchField.clear();
        searchField.sendKeys(categoryText.getText());
        searchField.sendKeys(Keys.ENTER);
    }

}
