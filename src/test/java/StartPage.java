import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends MainPage{
    public StartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }
}
