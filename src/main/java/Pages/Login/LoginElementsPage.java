//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
package Pages.Login;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginElementsPage {
    public static SelenideElement usernameField = $x("//*[@name=\"username\"]"); //айди нету у элемента чтоб прикрепить паф к нему
    public static SelenideElement passField = $x("//*[@name=\"password\"]"); //айди нету у элемента чтоб прикрепить паф к нему
    public static SelenideElement loginButton = $x("//*[text()=' Login ']"); //айди нету у элемента чтоб прикрепить паф к нему
    public static SelenideElement forgotPassOption = $x("//*[text()='Forgot your password? ']"); //айди нету у элемента чтоб прикрепить паф к нему
    public static SelenideElement requiredError = $x("//*[text()='Required']");
    public static SelenideElement bullShitCredentials = $x("//*[text()='Invalid credentials']");
}
