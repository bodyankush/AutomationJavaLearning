package Web.search;
import Base.BaseTest;
import pages.MainPage;
import pages.SearchResultsPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;

public class SearchHeadphones {

    @BeforeMethod
    public void openSite() {
        Selenide.open(BaseTest.baseUrl);
    }

    @Test
    public void headphonesFounded(){
        MainPage.SearchComponent.searchField.setValue("Навушники");
        MainPage.SearchComponent.searchButton.click();
        SearchResultsPage.HeaderComponent.pageTitle.getText().equals("Навушники");
        assert SearchResultsPage.ListOfItemsComponent.amountOfItems.size() == 24;
        assertTrue(SearchResultsPage.PaginationComponent.lastPaginationCount() > 3);
    }

}
