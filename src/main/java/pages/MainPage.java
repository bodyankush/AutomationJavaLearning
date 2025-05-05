package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public class SearchComponent {
        public static SelenideElement searchField = $x("//input[@id='ek-search']");
        public static SelenideElement searchButton = $x("//button[@name='search_but_']");
    }
}
