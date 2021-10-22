package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public YourStoriesPage getYourStoriesPage() {
        return new YourStoriesPage(driver);
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(driver);
    }

    public CoronavirusPage getCoronavirusPage() {
        return new CoronavirusPage(driver);
    }

    public NewsPage getNewsPage() {
        return new NewsPage(driver);
    }

    public ContactFormPage getContactFormPage() {
        return new ContactFormPage(driver);
    }
}
