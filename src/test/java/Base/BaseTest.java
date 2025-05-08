package Base;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class BaseTest {
    public static String baseUrl;

    static {
        try (InputStream input = BaseTest.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            baseUrl = prop.getProperty("url");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @BeforeMethod

    public void openSite() {
        Selenide.open(BaseTest.baseUrl);
    }

}
