package Web.search;
import pages.MainPage;
import pages.SearchResultsPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

public class SearchHeadphones {
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    @BeforeMethod
    public void openSite(){
        Selenide.open("https://ek.ua/ua/");
    }
    @Test
    public void headphonesFounded(){
        MainPage.searchField.setValue("Навушники");
        MainPage.searchButton.click();
        searchResultsPage.shouldHaveTitle("Навушники");
        searchResultsPage.ShouldHaveItemsCount(24);
        searchResultsPage.ShouldHavePaginationCountMoreThan(3);
    }
}
