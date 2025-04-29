package Web.Login;
import Pages.Login.LoginElementsPage;
import Pages.Dashboard.DashboardElementsPage;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import java.time.Duration;

//test pull
public class UserLogin {
    @Test
    public void loginSuccess(){
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginElementsPage.usernameField.setValue("Admin");
        LoginElementsPage.passField.setValue("admin123");
        LoginElementsPage.loginButton.click();
        if (DashboardElementsPage.dashboardHat.shouldBe(visible, Duration.ofSeconds(5)).isDisplayed()) {
            System.out.println("logged in");
        } else {
            Selenide.screenshot("loginFlowPositive - FAILED");
        }
    }
}