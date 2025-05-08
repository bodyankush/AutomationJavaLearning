package Web.search;

import Base.BaseTest;
import pages.MainPage;
import pages.SearchResultsPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;

public class SearchHeadphones extends BaseTest {
    public SearchResultsPage searchResultsPageObject = new SearchResultsPage();
    public MainPage mainPageObject = new MainPage();

    @Test
    public void headphonesFounded(){
        mainPageObject.search.searchField.setValue("Навушники");
        mainPageObject.search.searchButton.click();
        searchResultsPageObject.header.pageTitle.getText().equals("Навушники");
        assert searchResultsPageObject.productsList.amountOfItems.size() == 24;
        assertTrue(searchResultsPageObject.pagination.lastPaginationCount() > 3);
    }

}
