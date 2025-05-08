package Base;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import config.ProjectConfig;
import org.aeonbits.owner.ConfigFactory;

public class BaseTest {
    protected static final ProjectConfig config = ConfigFactory.create(ProjectConfig.class);

    @BeforeMethod
    public void openSite() {
        Selenide.open(config.prodUrl());
    }

}
