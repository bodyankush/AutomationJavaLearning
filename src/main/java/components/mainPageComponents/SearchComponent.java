package components.mainPageComponents;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class SearchComponent {
    public final SelenideElement searchField = $x("//input[@id='ek-search']");
    public final SelenideElement searchButton = $x("//button[@name='search_but_']");
}
