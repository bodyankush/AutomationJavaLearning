package components.searchResultsComponents;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderComponent {
    public final SelenideElement pageTitle = $x("//div[@class='page-title']//h1[@class='t2']");
}
