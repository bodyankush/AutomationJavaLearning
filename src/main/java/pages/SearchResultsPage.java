package pages;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.CollectionCondition.size;


public class SearchResultsPage {
    private final SelenideElement pageTitle = $x("//div[@class='page-title']//h1[@class='t2']");
    public void shouldHaveTitle (String expectedTitle) {
        pageTitle.shouldHave(text(expectedTitle));
    }
    private final ElementsCollection amountOfItems = $$x("//div[contains(@class, 'model-short-div list-item--goods   ')]");
    public void ShouldHaveItemsCount (int expectedItemsCount) {
        amountOfItems.shouldHave(size(expectedItemsCount));
    }
    private final SelenideElement lastPaginationButton = $x("(//div[@class='ib page-num']//a[text() and not(@id='pager_dots')])[last()]\n");
    public void ShouldHavePaginationCountMoreThan(int minPageCount){
        int actualCount = Integer.parseInt(lastPaginationButton.getText());
    }
}
