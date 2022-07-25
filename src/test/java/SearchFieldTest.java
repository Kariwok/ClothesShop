import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFieldTest extends BaseTest {

    @Test
    public void testSearchCategorySubmit() throws InterruptedException {

        String actualErrorMessage = openBaseURL()
                .setInputTextForSearchField("Dress")
                .getSearchButtonClick()
                .getCountResultsOfFoundElements()
                .getText();
        Thread.sleep(1500);

        Assert.assertEquals(actualErrorMessage, "6 results have been found.");
    }

    @Test
    public void testErrorMessageAfterNotExistingText() {
        String errorMessage = "No results were found for your search \"";
        String randomInputText = RandomStringUtils.randomAlphanumeric(10);

        String actualErrorMessage = openBaseURL()
                .setInputTextForSearchField(randomInputText)
                .getSearchButtonClick()
                .getSearchFieldErrorMessage();

        Assert.assertEquals(actualErrorMessage, errorMessage + randomInputText + "\"");
    }
}

