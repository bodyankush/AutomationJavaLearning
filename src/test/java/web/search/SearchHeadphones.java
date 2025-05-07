package Web.search;

import Base.BaseTest;
import pages.MainPage;
import pages.SearchResultsPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;

public class SearchHeadphones {
    public SearchResultsPage searchResultsPageObject = new SearchResultsPage();
    public MainPage mainPageObject = new MainPage();

    @BeforeMethod

    public void openSite() {
        Selenide.open(BaseTest.baseUrl);
    }

    @Test

    public void headphonesFounded(){
        mainPageObject.searchObject.searchField.setValue("Навушники");
        mainPageObject.searchObject.searchButton.click();
        searchResultsPageObject.headerObject.pageTitle.getText().equals("Навушники");
        assert searchResultsPageObject.listOfItemsObject.amountOfItems.size() == 24;
        assertTrue(searchResultsPageObject.paginationObject.lastPaginationCount() > 3);
    }

}
