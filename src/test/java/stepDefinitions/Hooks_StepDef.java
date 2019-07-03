package stepDefinitions;

import com.thegreatcourses.base.BasePage;
import com.thegreatcourses.utility.Browser;
import com.thegreatcourses.utility.Commons;
import com.thegreatcourses.utility.EnumTypes.BrowserType;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks_StepDef extends BasePage {

    private Commons commons = new Commons();

    @Before
    public void setUp() {
        WebDriver driver = new Browser(BrowserType.CHROME);
        driver.get("https://www.thegreatcourses.com");
        setDriver(driver);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            commons.captureScreenshot(scenario.getName());
        }
        getDriver().quit();
    }

}
