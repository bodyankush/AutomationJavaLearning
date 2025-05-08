package Web.search;

import Base.BaseTest;
import pages.MainPage;
import pages.SearchResultsPage;
import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;

public class GoodsSearch extends BaseTest {
    public SearchResultsPage searchResultsPage = new SearchResultsPage();
    public MainPage mainPage = new MainPage();

    @DataProvider (name = "productNames")
    public Object[][] productNames() {
        return new Object[][] {
                {"Навушники"},
                {"Мікрофон"},
                {"Телевізор"}
        };
    }

    @Test (dataProvider = "productNames")
    public void aGoodIsFounded(String productName){
        mainPage.search.searchField.setValue(productName);
        mainPage.search.searchButton.click();
        searchResultsPage.header.pageTitle.getText().equals(productName);
        assert searchResultsPage.productsList.amountOfItems.size() == 24;
        assertTrue(searchResultsPage.pagination.lastPaginationCount() > 3);
    }

}
