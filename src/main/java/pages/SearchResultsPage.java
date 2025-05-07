package pages;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.CollectionCondition.size;


public class SearchResultsPage {
    public static class HeaderComponent {
        public static final SelenideElement pageTitle = $x("//div[@class='page-title']//h1[@class='t2']");
    }
    public static class ListOfItemsComponent {
        public static final ElementsCollection amountOfItems = $$x("//div[contains(@class, 'model-short-div list-item--goods')]");
    }
    public static class PaginationComponent {
        public static final SelenideElement lastPaginationButton = $x("(//div[@class='ib page-num']//a[text() and not(@id='pager_dots')])[last()]");

            public static int lastPaginationCount (){
                return Integer.parseInt(lastPaginationButton.getText());
            }

    }
}
