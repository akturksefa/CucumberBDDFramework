package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Hooks {


    @Before
    public void setUp() {
        System.out.println("Method calisti");
    }

    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }


}
