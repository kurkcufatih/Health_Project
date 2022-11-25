package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import utilities.Driver;

    public class Hooks {

      //  public static RequestSpecification spec;


        @Before(value="@Api")
        public void setUp(){
        //    spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        }

        @Before(value="@Db")
        public void setUpDb(){

        }

        @After
        public void tearDown(Scenario scenario) {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshots");
            }
            Driver.closeDriver();
        }
    }

