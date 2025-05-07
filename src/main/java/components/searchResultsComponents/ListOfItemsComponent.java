package components.searchResultsComponents;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;

public class ListOfItemsComponent {
    public final ElementsCollection amountOfItems = $$x("//div[contains(@class, 'model-short-div list-item--goods')]");
}
