package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public static SelenideElement searchField = $x("//input[@id='ek-search']\n");
    public static SelenideElement searchButton = $x("//button[@name='search_but_']");
}
