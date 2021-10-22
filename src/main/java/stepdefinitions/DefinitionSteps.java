package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.List;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {

    WebDriver driver;
    HomePage homePage;
    YourStoriesPage yourStoriesPage;
    SearchResultsPage searchResultsPage;
    CoronavirusPage coronavirusPage;
    NewsPage newsPage;
    ContactFormPage contactFormPage;
    PageFactoryManager pageFactoryManager;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @When("User clicks 'News' button")
    public void userClicksNewsButton() {
        homePage.clickNewsButton();
    }

    @Then("User checks that name of the headline article are {string}")
    public void userChecksThatNameOfTheHeadlineArticleAreKeyword(final String expectedText) {
        newsPage = pageFactoryManager.getNewsPage();
        assertEquals(newsPage.getArticleText(), expectedText);
    }

    @Then("User checks that secondary article titles are {string} in {string}")
    public void userChecksThatSecondaryArticleTitlesAreKeyword(final String expectedText, final String number) {
        newsPage = pageFactoryManager.getNewsPage();
        WebElement title = newsPage.getTitleList().get(Integer.parseInt(number));
        assertEquals(title.getText(), expectedText);
    }


    @After
    public void tearDown() {
        driver.close();
    }


    @When("User stores the text of the category link of the headline article")
    public void userStoresTheTextOfTheCategoryLinkOfTheHeadlineArticle() {
        newsPage = pageFactoryManager.getNewsPage();
        newsPage.getCategoryText();
    }

    @And("User enter this text in the search bar")
    public void userEnterThisTextInTheSearchBar() {
        newsPage.enterTextToSearchField();
    }

    @Then("User checks that name of the first article is {string}")
    public void userChecksThatNameOfTheFirstArticleIsKeyword(final String expectedText) {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        assertEquals(searchResultsPage.getSearchResultTitleText(), expectedText);
    }
}

