package Pages.Dashboard;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class DashboardElementsPage {
    public static SelenideElement dashboardHat = $x("//*[text()='Dashboard']"); //айди нету у элемента чтоб прикрепить паф к нему
}
