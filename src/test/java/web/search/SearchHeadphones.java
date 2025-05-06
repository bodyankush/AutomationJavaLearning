package Web.search;
import Base.BaseTest;
import pages.MainPage;
import pages.SearchResultsPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

public class SearchHeadphones {

    @BeforeMethod
    public void openSite() {
        Selenide.open(BaseTest.baseUrl);
    }

    @Test
    public void headphonesFounded(){
        MainPage.SearchComponent.searchField.setValue("Навушники");
        MainPage.SearchComponent.searchButton.click();
        SearchResultsPage.HeaderComponent.shouldHaveTitle("Навушники");
        SearchResultsPage.ListOfItemsComponent.ShouldHaveItemsCount(24);
        SearchResultsPage.PaginationComponent.ShouldHavePaginationCountMoreThan(3);
    }

}
