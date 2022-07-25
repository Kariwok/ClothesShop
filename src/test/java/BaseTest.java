import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    private WebDriver driver;

    private final String BASE_URL = "https://test-modules.shopmk.cz/en/";

    @BeforeMethod
    protected void beforeMethod() {
        driver = BaseUtils.createDriver();
    }

    @AfterMethod
    protected void afterMethod() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public StartPage openBaseURL() {
        getDriver().get(BASE_URL);

        return new StartPage(getDriver());
    }

//    public String getExternalPageTitle() {
//
//        return getDriver().getTitle();
//    }
//
//    public String getExternalPageURL() {
//
//        return getDriver().getCurrentUrl();
//    }
}
