package components.searchResultsComponents;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class PaginationComponent {
    public final SelenideElement lastPaginationButton = $x("(//div[@class='ib page-num']//a[text() and not(@id='pager_dots')])[last()]");

    public int lastPaginationCount (){
        return Integer.parseInt(lastPaginationButton.getText());
    }

}
