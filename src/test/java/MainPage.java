import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class MainPage extends BasePage {
    private final By SEARCH_FIELD = By.xpath("//input[@id='search_query_top']");
    private final By SEARCH_BUTTON = By.name("submit_search");
    private final By COUNT_OF_FOUND_ELEMENTS_ON_PAGE = By.className("heading-counter");
    private final By ERROR_MESSAGE_IF_TEXT_NOT_FOUND = By.xpath("//div[@id='center_column']/p");

    public MainPage(WebDriver driver) {

        super(driver);
    }

    protected WebElement getSearchField() {

        return getDriver().findElement(SEARCH_FIELD);
    }

    protected WebElement getSearchButton() {

        return getDriver().findElement(SEARCH_BUTTON);
    }

    protected WebElement getErrorMessage(){
        return getDriver().findElement(ERROR_MESSAGE_IF_TEXT_NOT_FOUND);
    }

    protected MainPage setInputTextForSearchField(String text) {
        getSearchField().click();
        getSearchField().sendKeys(text);

        return this;
    }

    protected String getSearchFieldErrorMessage(){

        return getDriver().findElement(ERROR_MESSAGE_IF_TEXT_NOT_FOUND).getText();
    }

    protected MainPage getSearchButtonClick() {
        getSearchButton().click();

        return this;
    }

    protected WebElement getCountResultsOfFoundElements() {
        //getCountResultsOfFoundElements().getText();

        return getDriver().findElement(COUNT_OF_FOUND_ELEMENTS_ON_PAGE);
    }

}